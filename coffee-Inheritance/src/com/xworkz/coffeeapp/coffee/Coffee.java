package com.xworkz.coffeeapp.coffee;

public class Coffee {
	public String id;
	public String name;
	public double quantity;
	public int price;
	
	public void taste(String name, String type)
	{
		System.out.println( name +"coffee taste is good");
		System.out.println("coffee type is" + type);
	}

}
