package com.siva.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//Java based config file for replacing the XML config
//This class replaces application-config.xml file

@Configuration
@ComponentScan(basePackages = "com.siva.controllers")
public class LoveCalAppConfig {
	//set up view resolver in config file
	//in xml based config we create bean of View resolver in app-config file
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}
