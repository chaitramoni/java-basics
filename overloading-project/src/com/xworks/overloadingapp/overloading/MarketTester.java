package com.xworks.overloadingapp.overloading;

public class MarketTester {
	public static void main(String a[])
	{
		/*String sellerName[] = {"Akash","Suma","Sneha"};
		Market mar = new Market(123,"KR Market","Majestic",sellerName);
		System.out.println(mar.id + " " + mar.name + " " + mar.location);*/
		
		
				String sellerName[] = {"Akash","Suma","Sneha"};
				Market market2 = new Market(123,"KR Market","Majestic",sellerName);
				System.out.println(market2.id + " " + market2.name + " " + market2.location);
				
		market2.displayDetails();
		
	}

}
