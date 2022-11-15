package com.xworkz.chatshopapp;

public class ChatsShop {
	
	public String address;
	public String name;
	public String chatsNames[];
	public int noOfSections;
	public String billingMethod[];
	
	/*public ChatsShop()
	{
		System.out.println("chats shop object is created");
	}*/
	
	
	public ChatsShop(String address, String name,  String chatsNames[], int noOfSections, String billingMethod[]) {
		
		this. address =  address;
		this. name = name;
		this. chatsNames= chatsNames;
		this. noOfSections = noOfSections;
		this. billingMethod = billingMethod;
		
		
		
		
	}
	public void displayInfo()
	{
		
		System.out.println("chats shop name is" + name);
		System.out.println("chats shop address" + address);
		System.out.println("chats shop noOfSections is" + noOfSections);
		System.out.println("chats shop chats names is" + chatsNames);
		for(int i=0;i<chatsNames.length;i++)
		{
		System.out.println(chatsNames[i]);	
		}
		System.out.println("chats shop billingMethod is" + billingMethod);
		for(int i=0;i<billingMethod.length;i++)
		{
		System.out.println(billingMethod[i]);	
		}
		}
	}
	
		
		
		
		
		



	


