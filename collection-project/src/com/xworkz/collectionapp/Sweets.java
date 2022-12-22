package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sweets {
	
	public static void main(String[] args)
	{
		String sweet1 = "Jelebhi";
		String sweet2 = "MysorePak";
		String sweet3 = "Laddo";
		String sweet4 = "Jahangir";
		String sweet5 = "Peda";
		String sweet6 = "Bhadhusha";
		String sweet7 = "Jamoon";
		String sweet8 = "Rasagula";
		String sweet9 = "Holige";
		String sweet10 = "Payasa";
		String sweet11 = "Halva";
		String sweet12 = "Burfi";
		String sweet13 = "rasmali";
		
		Collection <String> collection = new LinkedList();
		
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);
		
		System.out.println(collection.size());
		
			collection.clear();
			System.out.println("After clear.........");
		
		System.out.println(collection.size());
		
		
		
		
		
		
		
	}

}
