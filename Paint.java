class Paint
{
	static int paintId;
	static String brandName;
	static String color;
	
	public static void setPaintId(int pId)
	{
	  paintId = pId;
	}
	public static int getPaintId()
	{
	return paintId;
	}
	
	
	public static void setBrandName(String name)
	{
	brandName=name;
	}
	public static String getBrandName()
	{
	return brandName;
	}
	
	
	public static void setColor(String col)
	{
	color = col;
	}
	public static String getColor()
	{
	return color;
	}

}