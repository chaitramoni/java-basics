package com.xworkz.constructorautowiredapp.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.constructorautowiredapp.configuration.SpringConfiguration;
import com.xworkz.constructorautowiredapp.thing.Engine;
import com.xworkz.constructorautowiredapp.thing.NewsPaper;
import com.xworkz.constructorautowiredapp.thing.Snake;

public class Runner {
	
	
public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		String[] beanNames = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		NewsPaper refOfNewsPaper = spring.getBean(NewsPaper.class);
		System.out.println(refOfNewsPaper);
		
		
		Engine refOfEngine = spring.getBean(Engine.class);
		System.out.println(refOfEngine);
		
		
		Snake refOfSnake = spring.getBean(Snake.class);
		System.out.println(refOfSnake);



}
}
