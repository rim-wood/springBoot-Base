package com.willmin.springboot.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 
 * @author WLM
 * @date 2016年7月2日
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class DruidConfig {
	@Primary //默认数据源 
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource creatDataSource() {
        return DataSourceBuilder.create().build();
    }
}
