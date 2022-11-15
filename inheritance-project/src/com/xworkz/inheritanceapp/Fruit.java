package com.xworkz.inheritanceapp;

public class Fruit {
	public String name;
	public  String type;
	public String importedFrom;
	public double price;
	
	public void toProvideEnergy(String name,String type)
	{
		this.name = name;
		this.type = type;
		System.out.println(this.name);
		System.out.println(this.type);
	}
	
	public void toProvideSufficientNutrients(String ediblePart,String botanicalName)
	{
		System.out.println("edible part of" + ediblePart);
		System.out.println("botanical name of fruit is" + botanicalName);
	}

}
