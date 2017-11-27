package com.zhangxin.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolConfiguration;
import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangxin on 2017/11/23.
 */
@Configuration
public class DataSourceConfig {

    /**
     * @ConfigurationProperties需要搭配@Configuration来使用
     * 配置zhangxin数据库的主库 连接池属性
     */
    @Bean
    @ConfigurationProperties("spring.datasource.zhangxin.master")
    public PoolConfiguration zhangxinMasterPoolConfiguration(){
        return new PoolProperties();
    }

    /**
     * @ConfigurationProperties需要搭配@Configuration来使用
     * 配置zhangxin数据库的从库 连接池属性
     */
    @Bean
    @ConfigurationProperties("spring.datasource.zhangxin.slave")
    public PoolConfiguration zhangxinSlavePoolConfiguration(){
        return new PoolProperties();
    }

    /**
     * 配置动态数据源
     * @Primary：自动装配时当出现多个Bean候选者时，被注解为@Primary的Bean将作为首选者，否则将抛出异常
     * @throws Exception
     */
    @Bean
    @Primary
    public javax.sql.DataSource zhangxinDynamicDataSource() throws Exception{
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map<Object, Object> targetDataSource = new HashMap<>();

        DataSource dataSourceMaster = new DataSource(zhangxinMasterPoolConfiguration());
        dataSourceMaster.createPool();
        targetDataSource.put(DBContextHolder.DATA_SOURCE_ZHANGXIN_MASTER, dataSourceMaster);

        DataSource dataSourceSlave = new DataSource(zhangxinSlavePoolConfiguration());
        dataSourceSlave.createPool();
        targetDataSource.put(DBContextHolder.DATA_SOURCE_ZHANGXIN_SLAVE, dataSourceSlave);

        dynamicDataSource.setTargetDataSources(targetDataSource);
        dynamicDataSource.setDefaultTargetDataSource(dataSourceMaster);
        return dynamicDataSource;
    }

    /**
     * @ConfigurationProperties需要搭配@Configuration来使用
     * 配置business数据库的主库 连接池属性
     */
    @Bean
    @ConfigurationProperties("spring.datasource.business.master")
    public PoolConfiguration businessMasterPoolConfiguration(){
        return new PoolProperties();
    }

    /**
     * 配置动态数据源
     * @throws Exception
     */
    @Bean(initMethod = "createPool")
    public javax.sql.DataSource businessDynamicDataSource() throws Exception{
        return new DataSource(businessMasterPoolConfiguration());
    }

    /**
     * 配置数据库模板
     * @throws Exception
     */
    @Bean
    public JdbcTemplate businessJdbcTemplate() throws Exception{
        return new JdbcTemplate(businessDynamicDataSource());
    }


}
