package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ChocolatePrice {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map =new HashMap<String,Integer>();
		
		map.put("cadbury", 20);
		map.put("perk", 10);
		map.put("munch", 5);
		map.put("lolipop", 10);
		map.put("candy", 2);
		map.put("milkybar", 10);
		map.put("kitkat", 10);
		map.put("5star", 10);
		map.put("snikkers", 10);
		map.put("alphalebe", 10);
		
		System.out.println(map.size());
		
		System.out.println(map.isEmpty());
		
		
		if(map.isEmpty()) {
			System.out.println("chocolate is not there");
		}else {
			System.out.println("chocolate is there");
			}
		
		System.out.println("======keys========");
		
		Set<String> keys = map.keySet();
		keys.forEach(e->System.out.println(e));
		
		
		System.out.println("======values========");
		
		Collection<Integer> values = map.values();
		values.forEach(v->System.out.println(v));
	
		System.out.println("======Keys and Values========");
		
		Set<Entry<String,Integer>>entries = map.entrySet();
		for(Entry<String,Integer> entry:entries)
			{
				System.out.println(entry.getKey() + " " + entry.getValue());
		
				
			}
	

	
//	
//	
//	
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
