package com.xworkz.listapp;

import java.util.ArrayList;

public class MethodsOfList {
	
	public static void main(String[] args) {
		
		List<String>list = new ArrayList<String>();
		
		list.add("R");
		list.add("Y");
		list.add("U");
		list.add("S");
		
		list.add(2, "E");
		for(String string : list) {
			System.out.println(string);
		}
		
		
		list.add(0,"J");
		
		System.out.println("=============");
		
		list.set(0,"Q");
		for(String string : list) {
			System.out.println(string);
		}
		
		
		System.out.println("====REMOVE=======");
		
		list.remove("E");
		
		list.set(4,"P");
		
		String ref = list.get(2);
		System.out.println(ref);
		
		
	}

}
