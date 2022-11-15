package com.xworkz.medicalshopapp;

import com.xworkz.medicalshopapp.medicalshop.MedicalShop;

public class MedicalShopTester {
	
	public static void main(String a[])
	{
		MedicalShop med = new MedicalShop();
		med.gstNo = "FDG2345";
		med.address = "Vijaynagar";
		med.name = "Maruthi Medical";
		med.noOfSections = 8;
		
		med.staffNames = new String[3];
		med.staffNames[0] = "Narang";
		med.staffNames[1] = "Sarang";
		med.staffNames[2] = "Bajarang";
		
		med.staffContactNo = new long[3];
		med.staffContactNo[0] = 3654429871L;
		med.staffContactNo[1] = 2624335662L;
		med.staffContactNo[2] = 2624335665L;
		
		med.medicineNames = new String[3];
		med.medicineNames[0] = "Paracetomol";
		med.medicineNames[1] = "Dolo";
		med.medicineNames[2] = "Dart";
		
		
		med.cosmetics = new String[3];
		med.cosmetics[0] = "suncream";
		med.cosmetics[1] = "BabyCream";
		med.cosmetics[1] = "FairandLovely";
		
		
		
		med.billingMethod = new String[3];
		med.billingMethod[0] = "cash";
		med.billingMethod[1] = "phonepay";
		med.billingMethod[2] = "debit card";
		
		med.displayInfo();
		
		
		
		
		
		
		
	}

}
