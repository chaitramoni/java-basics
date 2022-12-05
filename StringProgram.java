package com.xworkz.interviewapp;

public class StringProgram {
	public static void main(String a[])
	{
	String name = "Java Programming";
	System.out.println(name);
	
	
	
	
	for(int i = 0;i<name.length();i++)
	{
	System.out.print(" " + name.charAt(i));	
	}
	
	System.out.println("The Reverse Of The string is ");
	for(int i = name.length()-1;i>=0;i--)
	{
	System.out.print(" " + name.charAt(i));	
	}
	//counting a given char
	int count = 0;
	int count1=0;
	for(int i=0;i<name.length();i++)
	{
	if(name.charAt(i)=='a')
	{
	count+=1;//count++;	
	}else
	{
		//count1++;
		count1+=1;
	}
	}
	System.out.print("count:"  +count);
	System.out.print("count1:"  +count1);
	String str = "Good Learning";
	int count2 = 0;
	for(char ch:str.toCharArray())
	{
		if(ch=='o') {
			count2+=1;
		}
	//System.out.print(ch+ " ");	
	}
	System.out.println("count:"+count2);
	
	
	
	String names = "chaitra";
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

