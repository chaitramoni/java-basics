package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgFeesRunner {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map =new HashMap<String,Integer>();
		map.put("lakshmi", 2000);
		map.put("pedda", 3000);
		map.put("pooja", 4000);
		map.put("sri raghavedra", 5000);
		map.put("trinity", 2500);
		map.put("comforts", 6000);
		map.put("alp", 3500);
		map.put("transit", 2800);
		map.put("luxury", 4500);
		map.put("royalladies", 6500);
		
		System.out.println(map.size());
		
		System.out.println("==============");
		if(map.isEmpty()) {
			System.out.println("pg is occupied");
			
		}else {
			System.out.println("pg not occupied");
		}
		System.out.println("==============");
		
		Set<String> keys = map.keySet();
		
		keys.forEach(e->System.out.println(e));
		
		System.out.println("======values========");
		
		Collection<Integer> values = map.values();
		values.forEach(v->System.out.println(v));
		
		//System.out.println(map);
		Set<Entry<String,Integer>>entries = map.entrySet();
		
		for(Entry<String,Integer> entry:entries)
		{
			System.out.println(entry.getKey() + " " + entry.getValue());

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
