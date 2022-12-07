package com.xworkz.interviewapp.interviewapp;

public class ThirdLargestElement {
	public static void main (String[] args)
	{
	int array[] = {59,20,12,6,7};
	int temp;
	for(int i=0;i<array.length;i++)
	{
	for(int j=i+1;j<array.length;j++)
	{
		if(array[i]<array[j])
		{
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
		}
	}
	}
	System.out.println("Third Largest Number:" + " " + array[array.length -3]);
	}

}
