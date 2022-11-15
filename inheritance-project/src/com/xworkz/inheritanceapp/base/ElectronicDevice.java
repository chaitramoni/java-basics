package com.xworkz.inheritanceapp.base;

public class ElectronicDevice {
	public String name;
	public String brand;
	public String storageCapacity;
	public String color;
	public void takingPhotos(String name, String storageCapacity)
	{
		this.name = name;
		this.storageCapacity = storageCapacity;
		System.out.println(this.name);
		System.out.println(this.storageCapacity);
	}
	
	
	
}