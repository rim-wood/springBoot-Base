package com.willmin.springboot.config;

import java.util.Properties;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;
/**
 * MyBatis扫描接口，使用的tk.mybatis.spring.mapper.MapperScannerConfigurer，如果你不使用通用Mapper，可以改为org.xxx...
 * @author WLM
 * @date 2016年7月4日
 */
@Configuration
//TODO 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MybatisConfig.class)
public class MyBatisMapperScannerConfig {
	 @Bean
	 public MapperScannerConfigurer mapperScannerConfigurer() {
		 MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		 mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		 mapperScannerConfigurer.setBasePackage("tk.mybatis.springboot.mapper");
		 Properties properties = new Properties();
		 properties.setProperty("mappers", "com.willmin.springboot.utils.MyMapper");
		 properties.setProperty("notEmpty", "false");
		 properties.setProperty("IDENTITY", "MYSQL");
		 mapperScannerConfigurer.setProperties(properties);
		 return mapperScannerConfigurer;
	 }
}
