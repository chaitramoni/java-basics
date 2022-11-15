package com.xworkz.sort;
import java.util.*;

public class SortInDescending {
	public static void main(String a[])
	{
	Integer array[] = {1,2,3,4,5};
	Arrays.sort(array,Collections.reverseOrder());
	System.out.println(Arrays.toString(array));
	}

}
