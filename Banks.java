class Banks
{
	static String banksName[] = {null,null,null};
	static int index;
	
	public static boolean addBanksName(String banksName)
	{
	System.out.println("inside the addBanksName");
	banksName[index++] = banksName;
	    
	System.out.println("End of addBanksName");
	
	}
	
	
	public static void getBanksName()
	{
	for(int index = 0;index < banksName.length;index++)
	{
	String ref = banksName[index];
	System.out.println("Banks Name is" + ref);
	}
	
	}
	
	

}