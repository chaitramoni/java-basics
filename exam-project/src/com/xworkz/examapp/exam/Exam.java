package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class Exam {
	//classrooms,USN,hallTicket,id,mask
	
	public HallTicket hallTicket;
	public int fees;
	
	public Exam()
	{
		System.out.println("exam object is created");
	}
	public boolean allow(HallTicket hallTicket)
	{
		boolean isAllowed = false;
		System.out.println("inside allow method");
		System.out.println("the fee paid is :" + this.fees);
	if(fees >= 1200)
	{
		System.out.println("fees is paid");
		if(hallTicket != null)
		{
		this.hallTicket = hallTicket;
		System.out.println("Details of candidate hallTicket are");
		this.hallTicket.displayDetails();
		 isAllowed = true;
		System.out.println("hallticket has been issued can write exam");
	}
	else
	{
		System.out.println("hallticket is empty");
	}
	}
	else
	{
		System.out.println("first pay the fees");
	}
	return isAllowed;
	}
}

	
	

		
	
		
		
	
		
	
	