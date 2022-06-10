package com.siva.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Java based config file for replacing the XML config
//This class replaces application-config.xml file

@Configuration
@ComponentScan(basePackages="com.siva.controllers")
public class LoveCalAppConfig {

}
