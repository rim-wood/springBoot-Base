package com.willmin.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

/**
 * 
 * @author WLM
 * @date 2016年7月1日
 */
@Configuration
@EnableSwagger
@EnableAutoConfiguration
public class SwaggerConfig
{
	
	  private SpringSwaggerConfig springSwaggerConfig;

	    /**
	     * Required to autowire SpringSwaggerConfig
	     */
	    @Autowired
	    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig)
	    {
	        this.springSwaggerConfig = springSwaggerConfig;
	    }

	    /**
	     * Every SwaggerSpringMvcPlugin bean is picked up by the swagger-mvc
	     * framework - allowing for multiple swagger groups i.e. same code base
	     * multiple swagger resource listings.
	     */
	    @Bean
	    public SwaggerSpringMvcPlugin customImplementation()
	    {
	        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
	                .apiInfo(apiInfo())
	                .includePatterns(".*?");
	    }

	    private ApiInfo apiInfo()
	    {
	        ApiInfo apiInfo = new ApiInfo(
	                "服务平台",
	                "服务平台api",
	                "My Apps API terms of service",
	                "My Apps API Contact Email",
	                "My Apps API Licence Type",
	                "My Apps API License URL");
	        return apiInfo;
	    }
}