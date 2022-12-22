package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Bike {
	
	public static void main(String[] arg)
	{
	String bike1 = "Honda";
	String bike2 = "Shine";
	String bike3 = "Pulsor";
	String bike4 = "Hero";
	String bike5 = "RX";
	String bike6 = "Yamaha";
	String bike7 = "TVS";
	String bike8 = "discover";
	String bike9 = "Duke";
	String bike10 = "apache";
	String bike11 = "Jupiter";
	String bike12 = "pept";
	String bike13 = "Activa";
	String bike14 = "Wespa";
	String bike15 = "Bullet";
	String bike16 = "KTM";
	String bike17 = "Royal Enfiled";
	String bike18 = "fasino";
	
	Collection <String> collection = new ArrayList();
	
	
	collection.add(bike1);
	collection.add(bike2);
	collection.add(bike3);
	collection.add(bike4);
	collection.add(bike5);
	collection.add(bike6);
	collection.add(bike7);
	collection.add(bike8);
	
	System.out.println(collection.size());
	
	collection.clear();
	System.out.println("After clear.........");

System.out.println(collection.size());

	
	

}
}
