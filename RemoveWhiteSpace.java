package com.xworkz.interviewapp;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str = "My name is Chaitra";
		
		str = str.replaceAll("\\s+", "");
		
		System.out.println("String after removing all the white space: "+ str);
		
	}
}
