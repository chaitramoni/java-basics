package com.xworkz.hospitalapp.hospital;

public class HospitalTester {
	public static void main(String a[])
	{
	Hospital hospital = new Hospital();
	
	hospital.savepatientNames("Ganesh");
	hospital.savepatientNames("Ajay");
	hospital.savepatientNames("vijay");
	hospital.savepatientNames("ramesh");
	hospital.savepatientNames("Akash");
	hospital.savepatientNames("Giri");
	
	hospital.getPatientNames();
	
	hospital.updatePatientNames("ramesh","ramesh kumar");
	hospital.getPatientNames();
	}

}
