package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftWareCompany {
	
	public static void main(String[] args)
	{
		String name1 = "microsoft";
		String name2 = "oracel";
		String name3 = "ibm";
		String name4 = "salesforce";
		String name5 = "intuit";
		String name6 = "sap";
		String name7 = "vmware";
		String name8 = "autodesk";
		String name9 = "splunk";
		String name10 = "dell";
		String name11 = "atlassian";
		String name12 = "adp";
		String name13 = "gen digital";
		String name14 = "xero";
		String name15 = "bmc software";
		String name16 = "citrix systems";
		String name17 = "infosys";
		String name18 = "bosch";
		String name19 = "capgemini";
		String name20 = "twillio";
		
		
		Collection<String> name = new ArrayList();
		
		name.add(name20);
		name.add(name19);
		name.add(name17);
		name.add(name18);
		name.add(name1);
		
		System.out.println("Accessing all elements from collection");
		
		for(String element:name) {
			System.out.println(element);
		}
		
		System.out.println("===========Acessing through Iterator========");
	
		Iterator<String> element = name.iterator();
		
		while(element.hasNext()) {
			String str = element.next();
			System.out.println(str);
		}
		
		
	}

	}


