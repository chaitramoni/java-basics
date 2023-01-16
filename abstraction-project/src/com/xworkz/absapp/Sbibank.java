package com.xworkz.absapp;

public class Sbibank extends Bank implements ICard{
	
	
	@Override
	public void swipe() {
		System.out.println("Swipping SBI Bank card");
	}

}