package com.xworkz.interviewapp;

public class ComparingString {
	
	public static void main(String a[])
	{
		String names = "madam";
		String reverse = "";
		for(int i=names.length()-1;i>=0;i--)
		{
		reverse+=names.charAt(i);	
		}
		
		if(names.equals(reverse))
		{
		System.out.println("matched");	
		}else {
			System.out.println("not matched");

}
	}
}
