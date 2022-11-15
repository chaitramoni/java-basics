package com.xworkz.icecreamapp;

import com.xworkz.icecreamapp.IceCream;

public class IceCreamTester {
	public static void main(String a[])
	{
		
		
		String icecreamNames[] = new String[3];
		icecreamNames[0] = "candy";
		icecreamNames[1] = "kulfi";
		icecreamNames[2] = "cone";
		
		
		String billingMethod[] = new String[3];
		billingMethod[0] = "cash";
		billingMethod[1] = "scan";
		billingMethod[2] = "card";
		
		IceCream ice = new IceCream("JpNagar","Ganesh IceCream parlour", icecreamNames,billingMethod );
		
		/*IceCream ice = new IceCream();
		ice.address = "JpNagar";
		ice.name = "Ganesh IceCream parlour";
		
		ice. icecreamNames[] = new String[3];
		ice.icecreamNames[0] = "candy";
		ice.icecreamNames[1] = "kulfi";
		ice.icecreamNames[2] = "cone";
		
		
		ice. billingMethod[] = new String[3];
		ice.billingMethod[0] = "cash";
		ice.billingMethod[1] = "scan";
		ice.billingMethod[2] = "card";*/
		
		
		
		
		
		
		
		
		
		ice.displayInfo();
		
				
		
			
			
		}

	

	}


