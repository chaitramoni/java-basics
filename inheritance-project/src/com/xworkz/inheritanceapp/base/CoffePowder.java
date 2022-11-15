package com.xworkz.inheritanceapp.base;

public class CoffePowder {
	public String name;
	public String brand;
	public void drinking(String name, String brand)
	{
		this.name = name;
		this.brand = brand;
		System.out.println(this.name);
		System.out.println(this.brand);
	}

}
