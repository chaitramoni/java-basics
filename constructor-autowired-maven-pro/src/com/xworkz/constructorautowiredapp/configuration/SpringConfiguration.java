package com.xworkz.constructorautowiredapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.constructorautowiredapp")

public class SpringConfiguration {
	
	@Bean
	public int newspaperId() {
		System.out.println("registering id...");
		return 1234;
	}
	
	@Bean
	public String newspaperName() {
		System.out.println("registering name...");
		return "hindhu";
	}
	
	@Bean
	public String newspaperOwnerName() {
		System.out.println("registering ownername...");
		return "chaitra";
	}
	
	@Bean
	public String newspaperLanguage() {
		System.out.println("registering language...");
		return "English";
	}
	
	@Bean
	public int newspaperPrice() {
		System.out.println("registering price...");
		return 50;
	}
	
	
	//engine
	
	
	@Bean
	public String EngineName() {
		System.out.println("registering name...");
		return "railwayengine";
	}
	
	@Bean
	public String EngineType() {
		System.out.println("registering type...");
		return "railway";
	}
	
	@Bean
	public int EngineNumber() {
		System.out.println("registering number...");
		return 45;
	}
	
	@Bean
	public double EngineVersion() {
		System.out.println("registering version...");
		return 5.0;
	}
	
	
	@Bean
	public String EngineCompany() {
		System.out.println("registering company...");
		return "indian";
	}
	
	
	//snake
	
	@Bean
	public String snakeName() {
		System.out.println("registering name...");
		return "python";
	}
	
	@Bean
	public int snakeLength() {
		System.out.println("registering length...");
		return 12;
	}
	
	@Bean
	public String snakeColor() {
		System.out.println("registering color...");
		return "grey";
	}
	
	
	@Bean
	public String snakeType() {
		System.out.println("registering type...");
		return "dangerous";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
