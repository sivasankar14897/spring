package com.siva.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//JAVA based configuration for replacement for web.xml
//Our config class should implement WebApplicationInitializer
//WebApplicationInitializer has only one method onStartuo()
//The implementation for ServletContext obj will be provided by Servlet 
//container i.e our server Tomcat

public class LoveCalAppIntializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//in spring config file we declare beans etc i.e app-config.xml
		XmlWebApplicationContext appContext = new XmlWebApplicationContext();
		appContext.setConfigLocation("classpath:application-config.xml");

		// create a Dispatcher servlet
		DispatcherServlet ds = new DispatcherServlet(appContext);

		// register our dispatcher servlet with ServletContext obj
		// we have registered our dispatcher servlet with servletContext
		ServletRegistration.Dynamic mydispatcher = servletContext.addServlet("dispatcherServlet", ds);

		mydispatcher.setLoadOnStartup(1);
		mydispatcher.addMapping("/*");

	}

}
