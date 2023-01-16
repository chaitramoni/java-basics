package com.xworkz.springapp;

import com.xworkz.springapp.boot.Road;

public class RoadRunner {
	
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext
		
		Road ref = spring.getBean(Road.class);
		System.out.println(ref);
		
				
	}

}
