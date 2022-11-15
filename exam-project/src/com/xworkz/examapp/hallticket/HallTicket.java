package com.xworkz.examapp.hallticket;

public class HallTicket {
	private String candidateName;
	private String usnNo;
	private String universityName;
	private String subjectNames[];
	
	public HallTicket()
	{
		System.out.println("hallticket object is created");
	}
	
	public HallTicket(String candidateName,String usnNo,String universityName,String subjectNames[])
	{

	this.candidateName = candidateName;
	this.usnNo = usnNo;
	this.universityName = universityName;
	this.subjectNames = subjectNames;
	}

	public void displayDetails()
	{
		System.out.println("candidate name:" + this.candidateName);
		System.out.println("university name:" + this.universityName);
		System.out.println("usnNo:" + this.usnNo);
		System.out.println("subject list given by candidate");
		for(int i = 0;i<subjectNames.length;i++)
		{
		System.out.println(subjectNames[i]);	
		}
	}

}
