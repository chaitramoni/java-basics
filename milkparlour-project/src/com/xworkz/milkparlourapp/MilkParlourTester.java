package com.xworkz.milkparlourapp;


public class MilkParlourTester {
	
	public static void main(String u[])
	{

	/*milk.address = "JpNagar";
	milk.name = "Ganesh MilkParlour";
	milk.noOfSections = 2;
	
	
	milk.chatsNames = new String[3];
	milk.chatsNames[0] = "Milk";
	milk.chatsNames[1] = "Curd";
	milk.chatsNames[2] = "ButterMilk";
	
	milk.billingMethod = new String[3];
	milk.billingMethod[0] = "cash";
	milk.billingMethod[1] = "scan";
	milk.billingMethod[2] = "card";*/
	
	
	
	//milk.noOfSections = 2;
	
	
	String milkNames[] = new String[3];
	milkNames[0] = "Milk";
	milkNames[1] = "Curd";
	milkNames[2] = "ButterMilk";
	
	String billingMethod[] = new String[3];
	billingMethod[0] = "cash";
	billingMethod[1] = "scan";
	billingMethod[2] = "card";
	
	
	MilkParlour milk = new MilkParlour("JpNagar", "Ganesh MilkParlour", milkNames,billingMethod);
	
	milk.displayInfo();
	
			
	
		
		
	}

}



