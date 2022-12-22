package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityNames {
	
	public static void main(String[] args)
	
	{
	
	
	
	String city1 = "rajaginagar";
	String city2 = "dasarahalli";
	String city3 = "nagasandra";
	String city4 = "peenya";
	String city5 = "mahalakshmi";
	
	Collection<String> collection = new ArrayList();
	
	collection.add(city5);
	collection.add(city4);
	collection.add(city3);
	collection.add(city2);
	collection.add(city1);
	
	
	System.out.println("Accessing all elements from collection");
	
	for(String element:collection) {
		System.out.println(element);
	}
	
	System.out.println("===========Acessing through Iterator========");
	
	Iterator<String> element = collection.iterator();
	
	while(element.hasNext()) {
		String str = element.next();
		System.out.println(str);
	}
	
	
	
	
	
	
	}	

}
