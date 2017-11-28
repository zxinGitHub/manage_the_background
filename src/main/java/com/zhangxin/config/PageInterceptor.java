package com.zhangxin.config;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Intercepts({@Signature(
        type = Executor.class,
        method = "query",
        args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}
)})
public class PageInterceptor implements Interceptor {
    private static final Logger LOG = LoggerFactory.getLogger(PageInterceptor.class);
    private Field additionalParametersField;

    public PageInterceptor() {
    }

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement)args[0];
        Object parameter = args[1];
        RowBounds rowBounds = (RowBounds)args[2];
        ResultHandler resultHandler = (ResultHandler)args[3];
        if(rowBounds.getLimit() >= 2147483647) {
            return invocation.proceed();
        } else {
            Executor executor = (Executor)invocation.getTarget();
            BoundSql boundSql = ms.getBoundSql(parameter);
            String pageSql = getPageSql(boundSql.getSql(), rowBounds);
            BoundSql boundPageSql = new BoundSql(ms.getConfiguration(), pageSql, boundSql.getParameterMappings(), parameter);
            CacheKey cacheKey = executor.createCacheKey(ms, parameter, rowBounds, boundSql);
            Map additionalParameters = (Map)this.additionalParametersField.get(boundSql);
            Iterator result = additionalParameters.keySet().iterator();

            while(result.hasNext()) {
                String key = (String)result.next();
                boundPageSql.setAdditionalParameter(key, additionalParameters.get(key));
            }

            List result1 = executor.query(ms, parameter, RowBounds.DEFAULT, resultHandler, cacheKey, boundPageSql);
            return result1;
        }
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        try {
            this.additionalParametersField = BoundSql.class.getDeclaredField("additionalParameters");
            this.additionalParametersField.setAccessible(true);
        } catch (Exception var3) {
            LOG.error(var3.getMessage(), var3);
            throw new RuntimeException(var3);
        }
    }

    private static final String getPageSql(String sql, RowBounds rowBounds) {
        StringBuilder sb = new StringBuilder();
        sb.append(sql).append(" limit ").append(rowBounds.getOffset()).append(",").append(rowBounds.getLimit());
        return sb.toString();
    }
}
