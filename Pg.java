class Pg
{
	static int rent;
	static String pgName;
	static String address;
	
	public static void setRent(int price)
	{
	  rent = price;
	}
	public static int getRent()
	{
	return rent;
	}
	
	
	public static void setpgName(String name)
	{
	pgName=name;
	}
	public static String getPgName()
	{
	return pgName;
	}
	
	public static void setAddress(String add)
	{
		address=add;
	}
	public static String getAddress()
	{
	return address;	
	}
	
	
}