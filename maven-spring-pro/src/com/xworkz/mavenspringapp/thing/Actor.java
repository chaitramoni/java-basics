package com.xworkz.mavenspringapp.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	
	private String name1;
	private String language1;
	private Integer age1;
	
	
	public Actor @Value("sudeep")String name, @Value("kannada")String language,@Value("45") Integer age) {
		
		//System.out.println("constructor of actor name,language,age");
		this.name1 = name1;
		this.language1 = language1;
		this.age1 = age1;
	}
	
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		this.name1 = name;
	}
	public Integer getAge() {
		return age1;
	}
	public void setAge1(Integer age1) {
		this.age1 = age1;
	}
	public String getLanguage() {
		return language1;
	}
	
	
	
	

}
