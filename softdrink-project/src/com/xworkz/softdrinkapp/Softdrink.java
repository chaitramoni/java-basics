package com.xworkz.softdrinkapp;

public class Softdrink {
	
	static public String drinkPrice;
	static public String drinkQuantity;
	
	public String drinkId;
	public String drinkName;;
	public String drinkFlavour;
	//constructor
	public Softdrink()
	{
	}
	//parameterized constructor
	public Softdrink(String dId,String nM,String dF)
	{
	drinkId = dId;
	drinkName = nM;
	drinkFlavour = dF;
	}
	public void toGetEnergy()
	{
		System.out.println("My Drink");
	}
}
