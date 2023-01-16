package com.xworkz.mavenspringapp.boot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mavenspringapp.boot.configuration.SpringConfiguration;
import com.xworkz.mavenspringapp.thing.Animal;
import com.xworkz.mavenspringapp.thing.Chats;
import com.xworkz.mavenspringapp.thing.Metro;
import com.xworkz.mavenspringapp.thing.Temperature;
import com.xworkz.mavenspringapp.thing.Vechiles;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
	Animal ref = spring.getBean(Animal.class);
	System.out.println(ref);
	
	Chats str = spring.getBean(Chats.class);
	System.out.println(str);
	
	Metro ref1 = spring.getBean(Metro.class);
	System.out.println(ref1);
	
	Temperature str1 = spring.getBean(Temperature.class);
	System.out.println(str1);
	
	Vechiles ref2 = spring.getBean(Vechiles.class);
	System.out.println(ref2);
	
	System.out.println("=============================");
	
	Boolean[] values = {false,true,false,true,false};
	System.out.println();
	
	List<String> list = new ArrayList();
	list.add("rose");
	list.add("lotus");
	list.add("jasmine");
	System.out.println(list);
	
	
	Map<String,Integer> map = new HashMap<String, Integer>();
	map.put("candy",10);
	map.put("alphalebe", 20);
	System.out.println(map);
	
	
		}

}
