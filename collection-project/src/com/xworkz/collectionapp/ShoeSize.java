package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {
	
	public static void main(String[] args)
	{
		Integer size1 = 1;
		Integer size2 = 2;
		Integer size3 = 3;
		Integer size4 = 4;
		Integer size5 = 5;
		Integer size6 = 6;
		Integer size7 = 7;
		Integer size8 = 8;
		Integer size9 = 9;
		Integer size10 = 10;
		Integer size11 = 11;
		Integer size12 = 12;
		Integer size13 = 13;
		Integer size14 = 14;
		Integer size15 = 15;
		
		
		Collection<Integer> size = new ArrayList();
		
		size.add(size1);
		size.add(size3);	
		size.add(size6);	
		size.add(size8);	
		size.add(size5);	
		size.add(size8);
		
		System.out.println("Accessing all elements from collection");
		
		for(Integer element:size) {
			System.out.println(element);
		}
		
		System.out.println("===========Acessing through Iterator========");
	
		Iterator<Integer> element = size.iterator();
		
		while(element.hasNext()) {
			Integer str = element.next();
			System.out.println(str);
		}
		
	}

}
