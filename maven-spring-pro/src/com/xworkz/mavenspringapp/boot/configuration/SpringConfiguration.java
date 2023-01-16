package com.xworkz.mavenspringapp.boot.configuration;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;

import com.xworkz.mavenspringapp.thing.Animal;
import com.xworkz.mavenspringapp.thing.Chats;
import com.xworkz.mavenspringapp.thing.Metro;
import com.xworkz.mavenspringapp.thing.Temperature;
import com.xworkz.mavenspringapp.thing.Vechiles;

public class SpringConfiguration {
	
	@Bean
	public Animal animal() {
		System.out.println("registering animal with spring");
		Animal animal = new Animal();
		return animal;
	}
	
	
	
	@Bean
	
	public Chats chats() {
		System.out.println("registering chats with spring");
		Chats chats = new Chats();
		return chats;
	}
	
	
	@Bean
	
	public Metro metro() {
		System.out.println("registering metro with spring");
		Metro metro = new Metro();
		return metro;
		
	}
	
	@Bean
	
	public Temperature tem() {
		System.out.println("registering temperature with spring");
		Temperature tem = new Temperature();
		return tem;
	}
	
	@Bean
	
	public Vechiles vec() {
		System.out.println("registering vechiles with spring");
		Vechiles vec = new Vechiles();
		return vec;
	}
	
	@Bean
	
	public Boolean ref() {
		System.out.println("registering boolean with spring");
		Boolean ref = new Boolean(true);
		return ref;
	}
	
	@Bean
	public List getArraylist() {
		System.out.println("registering list witrh spring");
		List<String> list = new ArrayList<String>();
		return list;
	
		
	}
	@Bean
	
	public Map getMap() {
		System.out.println("registering map with spring");
		Map<String,Integer> map = new HashMap<String, Integer>();
		return map;
	}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
