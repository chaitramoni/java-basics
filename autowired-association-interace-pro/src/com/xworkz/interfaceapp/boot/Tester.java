package com.xworkz.interfaceapp.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.interfaceapp.configuration.SpringConfiguration;
import com.xworkz.interfaceapp.interfaceapp.Browser;
import com.xworkz.interfaceapp.interfaceapp.PetrolBunk;

public class Tester {
	
	public static void main(String[] args) {
ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		String[] beanNames = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		
		PetrolBunk bunk = spring.getBean(PetrolBunk.class);
		bunk.toPurchase();
		
		System.out.println("======================================");
		
		
		
	}

}
