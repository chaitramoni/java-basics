package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {
	
	public static void main(String [] args)
	{
		
		String animal1 = "dog";
		String animal2 = "cat";
		String animal3 = "rat";
		String animal4 = "sheep";
		String animal5 = "goat";
		String animal6 = "lion";
		String animal7 = "tiger";
		String animal8 = "monkey";
		String animal9 = "deer";
		String animal10 = "elephant";
		
		Collection<String> animal = new ArrayList();
		
		animal.add(animal10);
		animal.add(animal9);
		animal.add(animal8);
		animal.add(animal7);
		animal.add(animal6);
		animal.add(animal5);
		animal.add(animal4);
		animal.add(animal3);
		animal.add(animal2);
		animal.add(animal1);
		
		System.out.println("Accessing all elements from collection");
		
		for(String element:animal) {
			System.out.println(element);
		}
		
		System.out.println("===========Acessing through Iterator========");
		
		Iterator<String> element = animal.iterator();
		
		while(element.hasNext()) {
			String str = element.next();
			System.out.println(str);
		}
		
		
		
	}

}
