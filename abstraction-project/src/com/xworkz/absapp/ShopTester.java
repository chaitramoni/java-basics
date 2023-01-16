package com.xworkz.absapp;

public class ShopTester {
	
	public static void main(String[] args) {
		
		//Abstraction
		//ref - Interface & obj - class
		Shop shop = new BikeServiceShop();
		shop.doBussiness();
		
	}

}