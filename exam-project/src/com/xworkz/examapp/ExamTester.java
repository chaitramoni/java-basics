package com.xworkz.examapp;

import java.util.Scanner;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.hallticket.HallTicket;

public class ExamTester {
	public static void main(String a[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter candidate name");
		String candidateName = sc.next();
		System.out.println("enter candidate usn");
		String usnNo = sc.next();
		System.out.println("enter candidate university name");
		String universityName = sc.next();
		sc.close();
		
		
		
		String subjectNames[] = {"m1","os","hd","vlsi","mom"};
		HallTicket hallTicket = new HallTicket(candidateName, usnNo, universityName,subjectNames);
		Exam exam = new Exam();
		exam.fees = 1200;
		boolean isAllowed = exam.allow(hallTicket);
	System.out.println("allowed to write exam:" +isAllowed);
	
	
	HallTicket hallTicket1 = new HallTicket("Monith","18mca55","dabbhaVTU",subjectNames);
	Exam exam1 = new Exam();
	exam1.fees = 1200;
	boolean isAllowed1 = exam.allow(hallTicket1);
	System.out.println("allowed to write exam:" +isAllowed1);
	
	
	
	}
	
	

}