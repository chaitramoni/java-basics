package com.xworkz.icecreamapp;

public class IceCream {
	public String address;
	public String name;
	public String icecreamNames[];;
	public String billingMethod[];
	
	public IceCream()
	{
		System.out.println("Icecream object is created");
	}
	
	
	public IceCream(String address,String name,String icecreamNames[],String billingMethod[])
	{
		this.address = address;
		this.name = name;
		this.icecreamNames = icecreamNames;
		this.billingMethod = billingMethod;
				
	}
	
	public void displayInfo()
	{
		
		System.out.println("icecream name is" + name);
		System.out.println("icecream address" + address);
		System.out.println("icecream parlour  icecreamNames is" + icecreamNames);
		for(int i=0;i<icecreamNames.length;i++)
		{
		System.out.println(icecreamNames[i]);	
		}
		System.out.println("icecream parlour billingMethod is" + billingMethod);
		for(int i=0;i<billingMethod.length;i++)
		{
		System.out.println(billingMethod[i]);	
		}
		}
	}
	





