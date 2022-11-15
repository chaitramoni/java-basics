package com.xworkz.milkparlourapp;

public class MilkParlour {
		public String address;
		public String name;
		public String milkNames[];
		public String billingMethod[];
		
		
		
		public MilkParlour()
		{
			System.out.println("Milk Parlour object is created");
		}
		
		
		public MilkParlour(String address, String name, String milkNames[], String billingMethod[]) {
			
			this.address = address;
			this.name = name;
			this.milkNames = milkNames;
			this.billingMethod = billingMethod;
		}
		
		
		public void displayInfo()
		{
			
			System.out.println("milkparlour name is" + name);
			System.out.println("milkparlour address" + address);
			System.out.println("milkparlour  milkNames is" + milkNames);
			for(int i=0;i<milkNames.length;i++)
			{
			System.out.println(milkNames[i]);	
			}
			System.out.println("icecream parlour billingMethod is" + billingMethod);
			for(int i=0;i<billingMethod.length;i++)
			{
			System.out.println(billingMethod[i]);	
			}
			}
		}
		








