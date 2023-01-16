package com.xworkz.sanitizeapp;

import java.util.Collection;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SanitizerDTORunner {
	
	public static void main(String[] args)
	{
		SanitizerDTO dto1 = new SanitizerDTO("red",50.0,01);
		
		SanitizerDTO dto2 = new SanitizerDTO("pink",55.0,02);
		
		SanitizerDTO dto3 = new SanitizerDTO("black",55.0,03);
		
		SanitizerDTO dto4 = new SanitizerDTO("green",75.0,04);
		
		SanitizerDTO dto5 = new SanitizerDTO("grey",80.0,05);
		
		Collection<SanitizerDTO> collection = new LinkedList();
		
		collection.add(dto5);
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		for(SanitizerDTO element:collection)
		{
			if(element.getPrice()>5) {
				System.out.print(element);
			}
		}
		System.out.println("Total before removing Green"+collection.size());
		
		System.out.println("===========================");
		
		Iterator<SanitizerDTO> string = collection.iterator();
		
		while(string.hasNext()) {
			SanitizerDTO str = string.next();
			
			if("Green".equals(str.getColor())) {
			string.remove();
			System.out.println("Removing if Green"+ str);
			}
		}
		
		System.out.println("Total after removing Green"+collection.size());
		System.out.println("===========================");
		
		Iterator<SanitizerDTO> data = collection.iterator();
		
		while(data.hasNext()) {
			SanitizerDTO value = data.next();
			if(value != null) {
				System.out.println(value);
			}
		}
		
		System.out.println("===========================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



