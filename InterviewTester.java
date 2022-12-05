package com.xworkz.interviewapp;

public class InterviewTester {
	
	public static void reverse(String data)
	{
		char newData[] = data.toCharArray();
		for(int index = newData.length-1;index >= 0;index--)
		{
		System.out.print(newData[index] + " ");	
		}
		
		/*for(int index = 0;index<newData.length;index++)
		{
			System.out.println(newData[index] + " ");	
		}*/
	}
		
		public static void main(String a[])
		{
		reverse("Chaitra");	
		}
 	

}
