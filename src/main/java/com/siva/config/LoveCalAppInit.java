package com.siva.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Spring will create DS for us
//We no need to create DS
public class LoveCalAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[]= {LoveCalAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		
		String arr[]= {"/"};
		return arr;
	}

}
