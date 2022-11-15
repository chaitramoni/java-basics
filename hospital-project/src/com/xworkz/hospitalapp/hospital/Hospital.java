package com.xworkz.hospitalapp.hospital;

public class Hospital {
	//dataType variableNames[] = new DataType [size];
	String patientNames[] = new String[6];
	int index;
	
	
	Hospital()
	{
	System.out.println("Hospital object is created");	
	}
	
	public void savepatientNames(String patientName)
	{
	System.out.println("inside savepatientNames");
	
	if(patientName != null && patientNames.length > index )
	{
	patientNames[index++] = patientName;
	return;
	}
	else
	{
		System.out.println("patient name is full...bed ella");
	}
	System.out.println("end savepatientNames");
	return;
	}
	
	public void getPatientNames()
	{
		System.out.println("List of all patients");
		for (int i = 0;i < patientNames.length;i++)
		{
			System.out.println(patientNames[i]);
		}
	}
	
	public boolean updatePatientNames(String oldPatientName,String newPatientName)
	{
		
	System.out.println("Inside updatePatientNames");
	for(int i = 0;i<patientNames.length;i++)
	{
		if(patientNames[i] == oldPatientName)
		{
		patientNames[i] = newPatientName;
		return true;
		}
		else
		{
			//to get negative message
		}
	}
	return false;
	
	}
}
