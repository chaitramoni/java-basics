package com.xworkz.sort;

import java.util.Arrays;
public class SortInAscending {
	static int length;
	
	public static void printArray(int[] array)
	{
		for(int i = 0;i < length;i++)
		{
		System.out.println(array[i] + " ");	
		}
		System.out.println();
	}
	
	public static void sortArray(int[] array)
	{
		int temporary = 0;
		for(int i = 0;i < length;i++)
		{
		for(int j = i + 1;j < length;j++)
		{
		if(array[i] > array[j])
		{
		temporary = array[i];
		array[i] = array[j];
		array[j] = temporary;
		}
		}
		}
		System.out.println("Elements of array sorted in ascending order: ");
		printArray(array);
	}

}
