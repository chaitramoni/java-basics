package com.xworkz.stringapp;

public class StringMethod {
	
	public static void main(String[] args)
	{
		String str1 = "Radhika";
		String str2 = "Chandrika";
		
		String str3 = "Radhika and Chandrika are cousins";
		System.out.println(str1.charAt(4));//retuen character at specified index or position
		
		
		System.out.println("=========");
		
		System.out.println(str3.contains("are cousins"));//checks sequence of character
		System.out.println(str3.contains("hello"));
		
		System.out.println("======");
		
		
		System.out.println(str1.equals(str3));//compare 2 strings returns true if equals or false
		System.out.println(str2.equals(str2));
		
		System.out.println("======");
		
		String name = "moni";
		String name1 = "lokesh";
		String name2 = "chaitra";
		
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.equalsIgnoreCase(name2));//compare 2 strings ignoring consideration
		
		System.out.println("=======");
		
		String s1 = "Monith";
		String s2 = "Gowda";
		
		System.out.println(s1.concat(s2));//appends string to end of another string
		
		System.out.println("======");
		
		
		String t1 = "";
		String t2 = "Chaitra";
		
		System.out.println(t1.isEmpty());//checks string is empty or not
		System.out.println(t2.isEmpty());
		
		System.out.println("=======");
		
		
		String m1 = "";
		String m2 = "Aishu";
		
		System.out.println(m1.isBlank());
		System.out.println(m2.isBlank());
		
		System.out.println("=======");
		
		String l = "Lokesh";
		String sentence = " hai where are you";
		
		System.out.println(l.indexOf('k'));//check index of given character
		System.out.println(sentence.indexOf("you"));//checks index of given string
		//2 remaining
		
		System.out.println("=========");
		
		String h = "Rhohan";
		System.out.println(h.length());//returns length of specified string
		
		System.out.println("=====");
		
		String r = "Rama";
		System.out.println(r.replace("R", "B"));
		
		System.out.println("=======");
		
		
		String e = "Chaitra";
		System.out.println(e.toCharArray());
		
		System.out.println("=====");
		
		String m = " Do Yourself ";
		System.out.println(m.trim());//removes white space
		
		
		
		
		
		
		
	}
	
	

}
