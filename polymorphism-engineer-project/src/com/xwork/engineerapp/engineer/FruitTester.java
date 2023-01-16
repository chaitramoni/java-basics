package com.xwork.engineerapp.engineer;

import com.xwork.engineerapp.Fruit;
import com.xwork.engineerapp.Grape;
import com.xwork.engineerapp.Mango;


public class FruitTester {
	
		public static void main(String a[])
		{
			Fruit mango = new Mango();
			mango.getNutrition();
			
			
			Fruit Grape = new Grape();//polymorphism
			Grape.getNutrition();
		}


}
