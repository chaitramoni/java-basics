package com.xworkz.medicalshopapp.MedicalshopParameterized;

public class MedicalShopParameterizedTester {
	
	public static void main(String a[])
	{
		
		String staffNames[] = new String[3];
		staffNames[0] = "Narang";
		staffNames[1] = "Sarang";
		staffNames[2] = "Bajarang";	
		
		long staffContactNo[] = new long[3];
		staffContactNo[0] = 3654429871L;
		staffContactNo[1] = 2624335662L;
		staffContactNo[2] = 2624335665L;
		
		String medicineNames[] = new String[3];
		medicineNames[0] = "Paracetomol";
		medicineNames[1] = "Dolo";
		medicineNames[2] = "Dart";
		
		String cosmetics[] = new String[3];
		cosmetics[0] = "suncream";
		cosmetics[1] = "BabyCream";
		cosmetics[1] = "FairandLovely";
		
		
		
		String billingMethod[] = new String[3];
		billingMethod[0] = "cash";
		billingMethod[1] = "phonepay";
		billingMethod[2] = "debit card";
		
		MedicalShopParameterized med = new MedicalShopParameterized("FDHFV345","Jaynagar", "Maruthi Medicals",staffNames, staffContactNo,
				                             medicineNames, cosmetics, 4, billingMethod );
		
		med.displayInfo();
		
	}

}
