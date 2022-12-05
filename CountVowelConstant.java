package com.xworkz.interviewapp;

public class CountVowelConstant {
	
	public static void main(String t[])
	{
		int vCount = 0 ,ccount = 0;
		String str = "Rest a while and run a mile";
		
		str = str.toLowerCase();
		
		for(int g=0;g<str.length();g++)
		{
		if(str.charAt(g) == 'a'|| str.charAt(g) == 'e'|| str.charAt(g) )) {
			vCount++;
		}
		else if(str.charAt(g)>= 'a' || str.charAt(g) <= 'z') {
			cCount++;
		}
		}
		System.out.println("numbers of vowels: " + vCount);
		System.out.println("numbers of constant: " + cCount);
		
		}

}
