package com.willmin.springboot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author WLM
 * @date 2016年7月1日
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Application {
	private static final  Logger logger = Logger.getLogger(Application.class);
    
	/**
     * Start
     * look at http://localhost:8080/swagger/index.html
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("SpringBoot Start Success");
    }

}
