package com.xworkz.softdrinkapp;

public class SoftdrinkTester {
	public static void main (String a[])
	{
	Softdrink.drinkPrice = "G25";
	Softdrink.drinkQuantity = "ML500";
	
	Softdrink soft = new Softdrink("DF56","Maza","Mango");
	
	System.out.println("Softdrink Details");
	System.out.println(soft.drinkId + " " + soft.drinkName + " " + soft.drinkFlavour);
	System.out.println(Softdrink.drinkPrice);
	System.out.println(Softdrink.drinkQuantity);
	}

}
