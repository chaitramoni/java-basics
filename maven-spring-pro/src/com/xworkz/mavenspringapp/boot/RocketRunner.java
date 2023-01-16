package com.xworkz.mavenspringapp.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mavenspringapp.thing.Actor;
import com.xworkz.mavenspringapp.thing.Rocket;
import com.xworkz.mavenspringapp.thing.Season;

public class RocketRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(Rocket.class);
		
		Rocket refOfRocket = container.getBean("rocket" ,Rocket.class);
		System.out.println(refOfRocket);
		
		Actor refOfActor = container.getBean("actor" ,Actor.class);
		System.out.println(refOfActor);
		
		Season refOfSeason = container.getBean("season" ,Season.class);
		System.out.println(refOfRocket);
		
	}
}
	
	