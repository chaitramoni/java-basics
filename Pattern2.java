package com.xworkz.interviewapp;

public class Pattern2 {
	
	public static void main(String a[])
	{
		for(int row=1;row<=5;row++) {
		
		for(int col=1;col<=5;col++) {
			if(col==1||col==5||row==1||row==5||row==2&&col==2||row==2&&col==4
					||row==3&&col==3||row==4&&col==2||row==4&&col==4)
				
					{
				System.out.print("#");
				}
				else {
					System.out.print(" ");
					}
		
				}
			System.out.println();
			}
			}
	
	
		}





