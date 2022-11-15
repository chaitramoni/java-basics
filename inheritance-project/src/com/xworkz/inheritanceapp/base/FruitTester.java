package com.xworkz.inheritanceapp.base;

import com.xworkz.inheritanceapp.Fruit;

public class FruitTester {
	public static void main(String t[])
	{
		Fruit frt = new Fruit();
		frt.toProvideEnergy("Mango", "Orange");
		Fruit frt2 = new Fruit();
		frt2.toProvideSufficientNutrients("Mesocarp", "Citrus");
	}

}
