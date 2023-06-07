package com.xworkz.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



import lombok.extern.slf4j.Slf4j;


@Configuration
@ComponentScan("com.xworkz.project")
@Slf4j
public class ProjectConfiguration {
	
	public ProjectConfiguration() {
		log.info("created" +this.getClass().getSimpleName());
	}
	
	
	
	@Bean
	@Order(1)
	public ViewResolver viewResolver() {
		log.info("registering custom viewResolver");
		return new InternalResourceViewResolver("/",".jsp");
		
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		log.info("registering in LocalContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean  bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
		

}
	@Bean
	public PasswordEncoder encoder() {
		log.info("Registering the PasswordEncoder");
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public MultipartResolver multipartResolver() {
		log.info("Running in multipartResolver");
		return new StandardServletMultipartResolver();
	}
}



