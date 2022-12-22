package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.LinkedList;

public class Coupon {
	
	public static void main(String[] arg)
	{
		String coupon1 = "ice coupon";
		String coupon2 = "allplus";
		String coupon3 = "saver things";
		String coupon4 = "red coupon";
		String coupon5 = "queen bee";
		String coupon6 = "dolor general";
		String coupon7 = "travel coupon";
		String coupon8 = "grand coupon";
		String coupon9 = "big tree";
		String coupon10 = "supero mart";
		String coupon11= "fast lane";
		String coupon12 = "winter is over";
		
		Collection collection = new LinkedList();
		
		collection.add(coupon12);
		collection.add(coupon1);
		collection.add(coupon2);
		collection.add(coupon4);
		collection.add(coupon10);
		
		System.out.println(collection.size());
		
		collection.clear();
		System.out.println("After clear.........");
	
	System.out.println(collection.size());
	
	}

}
