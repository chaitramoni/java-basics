package com.xworkz.examapp;

import java.util.Scanner;

public class WrapperTester {
	
	public static void main(String[] args)
	{
		/*int age = 89;
		Integer age1 = age;//boxing
		int age2 = age1;//unboxing
		
		
		long contactNo = 9018319801L;
		Long contactNo1 = contactNo;
		long contactNo2 = contactNo1;
		
		
		char sc = 'B';
		Character sc1 = sc;
		char sc2 = sc1;
		
		double price = 345.0;
		Double price1 = price;
		double price2 = price1;
		
		byte id = 55;
		Byte id1 = id;
		byte id2 = id1;
		
		short amount = 1000;
		Short amount1 = amount;
		short amount2 = amount1;
		
		float quantity = 99.50F;
		Float quantity1 = quantity;
		float quantity2 = quantity1;
		
		boolean isConnected = true;
		Boolean isConnected1 = isConnected;
		boolean isCinnceted2 = isConnected1;*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Age");
		int age = scanner.nextInt();
		Integer age1 = age;
		System.out.println(age);
	}

}
