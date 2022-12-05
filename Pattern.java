package com.xworkz.interviewapp;

public class Pattern {
	
	public static void main(String a[])
	{
		for(int row=0;row<4;row++) {
		
		for(int col=0;col<=4;col++) {
		
		if(row==2 && col==4) {
			System.out.print("xworkz");
		}else {
			System.out.print(col);
		}
		}
		System.out.println();
		}
	}

}
