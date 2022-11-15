class TeaStall
{
	static int teaStallId;
	static String teaStallName;
	static String address;
	static long contactNo;
	
	public static void setTeaStallId(int id)
	{
	teaStallId = id;
	}
	
	public static int getTeaStallId()
	{
	return teaStallId;
	}
	
	
	
	
	public static void setContactNo(long cNo)
	{
	contactNo = cNo;
	}
	
	public static long getContactNo()
	{
	return contactNo;
	}
	
	
	
	
	public static void setAddress(String add)
	{
		address=add;
	}
	public static String getAddress()
	{
	return address;	
	}
	
	
	public static void setTeaStallName(String name)
	{
	teaStallName = name;
	}
	public static String getTeaStallName()
	{
		return teaStallName;
	}

}