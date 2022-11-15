package com.xworkz.chatshopapp.chatsshop;

import com.xworkz.chatshopapp.ChatsShop;

abstract class ChatsShopTester {
	public static void main(String a[])
	{
		
	/*ChatsShop shop = new ChatsShop();
	shop.address = "JpNagar";
	shop.name = "Ganesh ChatsShop";
	shop.noOfSections = 2;
	
	
	shop.chatsNames = new String[3];
	shop.chatsNames[0] = "DahiPuri";
	shop.chatsNames[1] = "Belpuri";
	shop.chatsNames[2] = "PaniPuri";
	
	shop.billingMethod = new String[3];
	shop.billingMethod[0] = "cash";
	shop.billingMethod[1] = "scan";
	shop.billingMethod[2] = "card";*/
	
		
		String chatsNames[] = new String[3];
		chatsNames[0] = "DahiPuri";
		chatsNames[1] = "Belpuri";
		chatsNames[2] = "PaniPuri";
		
		String billingMethod[] = new String[3];
		billingMethod[0] = "cash";
		billingMethod[1] = "scan";
		billingMethod[2] = "card";
	
		
		
		ChatsShop shop = new ChatsShop("JpNagar", "Ganesh ChatsShop", chatsNames, 2,  billingMethod   );

		
		
		
		
		
		
		shop.displayInfo();
	
			
	
		
		
	}

}
