package com.xworkz.goapro.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.goapro")
public class CasinoConfiguration {
	
	public  CasinoConfiguration() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

}
