package com.xworkz.mavenspringapp.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	@Value("india")
	private String country;
	
	@Value("SpaceRocket")
	private String name;
	
	@Value("50")
	private Double budget;
	
	
	public Rocket() {
		System.out.println("created rocket using no-argument constructor");
	}
	
	public String getCountry() {
		return country;
	}
	
	public Double getBudget() {
		return budget;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	

}
