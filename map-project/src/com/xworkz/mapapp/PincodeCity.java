package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PincodeCity {
	
public static void main(String[] args) {
		
		Map<String,Integer> map =new HashMap<String,Integer>();
		map.put("bangalore",560073 );
		map.put("mysore",567998 );
		map.put("mandya",560089 );
		map.put("shivamoga",560095 );
		map.put("mangalore",560034 );
		map.put("belagavi",560021 );
		map.put("hubhali",560032 );
		map.put("nanjanagud",560081 );
		map.put("doddabhallapura",560096 );
		map.put("kengeri",560035 );

		System.out.println(map.size());
		
		System.out.println("==============");
		if(map.isEmpty()) {
			System.out.println("city is occupied");
			
		}else {
			System.out.println("city not occupied");
		}
		System.out.println("==============");
		
		Set<String> keys = map.keySet();
		
		keys.forEach(e->System.out.println(e));
		
		System.out.println("======values========");
		
		Collection<Integer> values = map.values();
		values.forEach(v->System.out.println(v));
		
		System.out.println("==============");
		
		
		Set<Entry<String,Integer>>entries = map.entrySet();
		
		for(Entry<String,Integer> entry:entries)
		{
			System.out.println(entry.getKey() + " " + entry.getValue());

			
		}
		

		

}
}
