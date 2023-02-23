package com.xworkz.plane.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class PlaneWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer  {
	
	public PlaneWebInit() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
	System.out.println("running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses ");
		return new Class[] {PlaneConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
		configurer.enable();
	}

}
