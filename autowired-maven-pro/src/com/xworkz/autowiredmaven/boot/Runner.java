package com.xworkz.autowiredmaven.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowiredmaven.configuration.SpringConfiguration;
import com.xworkz.autowiredmaven.thing.HardwareShop;
import com.xworkz.autowiredmaven.thing.Pencil;
import com.xworkz.autowiredmaven.thing.Rubber;
import com.xworkz.autowiredmaven.thing.Software;
import com.xworkz.autowiredmaven.thing.SoftwareEngineer;
import com.xworkz.autowiredmaven.thing.Street;


public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		String[] beanNames = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		HardwareShop refOfHardwareShop = spring.getBean(HardwareShop.class);
		System.out.println(refOfHardwareShop);
		
		Pencil refOfPencil = spring.getBean(Pencil.class);
		System.out.println(refOfPencil);
		
		Rubber refOfRubber = spring.getBean(Rubber.class);
		System.out.println(refOfRubber);
		
		Software refOfSoftware = spring.getBean(Software.class);
		System.out.println(refOfSoftware);
		
		SoftwareEngineer refOfSoftwareEngineer = spring.getBean(SoftwareEngineer.class);
		System.out.println(refOfSoftwareEngineer);
		
		Street refOfStreet = spring.getBean(Street.class);
		System.out.println(refOfStreet);
	
	
	}

}
