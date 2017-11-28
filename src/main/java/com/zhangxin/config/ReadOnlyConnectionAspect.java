package com.zhangxin.config;

import com.zhangxin.annotation.ReadOnlyConnection;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 切换数据源
 * Created by zhangxin on 2017/11/24.
 */
@Component
@Aspect
@Order(-1) //保证aop在@Transcational之前执行
public class ReadOnlyConnectionAspect {

    private static final Logger logger = LoggerFactory.getLogger(ReadOnlyConnectionAspect.class);

    @Before("@annotation(readOnlyConnection)")
    public void changeDataSource(JoinPoint joinPoint, ReadOnlyConnection readOnlyConnection){
        //获取切换的数据源的名字
        logger.debug("切换数据源开始啦！！");
        System.out.println("切换数据源开始啦！！");
        String sourceName = readOnlyConnection.value();
        DBContextHolder.setDBType(sourceName);
    }

    @After("@annotation(readOnlyConnection)")
    public void clearDataSource(JoinPoint joinPoint, ReadOnlyConnection readOnlyConnection){
        //获取切换的数据源的名字
        logger.debug("清除数据源！！");
        System.out.println("清除数据源！！");
        DBContextHolder.clearDBType();
    }

}
