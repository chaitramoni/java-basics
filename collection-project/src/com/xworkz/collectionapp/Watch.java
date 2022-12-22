package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;




public class Watch {
	
	public static void main(String[] args)
	{
		
		String watch1 = "fasttrack";
		String watch2 = "hmt";
		String watch3 = "boat";
		String watch4 = "titan";
		String watch5 = "firebolt";
		
		Collection<String> collection = new ArrayList();
		
		collection.add(watch5);
		collection.add(watch4);
		collection.add(watch3);
		collection.add(watch2);
		collection.add(watch1);
		
		
		
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
