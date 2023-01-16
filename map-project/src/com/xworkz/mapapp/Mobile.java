package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mobile {
	
	public static void main(String[] args) {
		
		Map<String, Double> mobileAndPriceMap = new HashMap<String, Double>();
		mobileAndPriceMap.put("micromax", 29000.84 );
		mobileAndPriceMap.put("lava", 28000.48 );
		mobileAndPriceMap.put("oppo", 16499.00 );
		mobileAndPriceMap.put("SamsungGalaxy", 10499.78);
		mobileAndPriceMap.put("Redmi9", 12999.67);
		mobileAndPriceMap.put("celkon", 7499.78);
		mobileAndPriceMap.put("karbon", 15490.77);
		mobileAndPriceMap.put("lyf",13699.00);
		mobileAndPriceMap.put("SamsungA23", 19999.00);
		mobileAndPriceMap.put("Nokia", 13999.67);
		
		System.out.println("======================================");
		
		System.out.println("Print all entries in capital Letter:");
		mobileAndPriceMap.forEach((ele1, ele2) -> System.out.println("key:" + ele1.toUpperCase() + " " + "value:" + ele2));
		
		System.out.println("======================================");
		
		System.out.println("Print entries if price is greater than 10000:");
		mobileAndPriceMap.forEach((ele1, ele2) -> {
													if(ele2 > 10000) {
														System.out.println(ele1 +" "+ ele2);
													}				
												});
		
		System.out.println("======================================");
		
		System.out.println("Print Entries if key is less than 5 characters:");
		mobileAndPriceMap.forEach((ele1, ele2) -> {
													if(ele1.length() < 5) {
														System.out.println(ele1 + " "+ ele2);
													}
												});
		
		System.out.println("======================================");
		
		System.out.println("Sort and print entries by desc order");
		Map<String, Double> ref =  new TreeMap<String, Double>();
							
		ref.put("micromax", 29000.84 );
		ref.put("lava", 28000.48 );
		ref.put("oppo", 16499.00 );
		ref.put("SamsungGalaxy", 10499.78);
		ref.put("Redmi9", 12999.67);
		ref.put("celkon", 7499.78);
		ref.put("karbon", 15490.77);
		ref.put("lyf",13699.00);
		ref.put("SamsungA23", 19999.00);
		ref.put("Nokia", 13999.67);
		
		ref.forEach((key, value) -> System.out.println("key:" + key + " "+ "value" + value));
		
		
	}

}
