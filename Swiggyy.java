class Swiggyy
{
	public static  double takeOrder(String item)
	{
	
	if (item == "Piza")
	 {
	 System.out.println("Thankyou for orderin" + item);
	 return 250.00;
	 }
	if (item == "Burger")
	{
	 System.out.println("Thankyou for orderin" + item);
	 return 60.00;
	}
	if (item == "SouthIndian")
	{
	 System.out.println("Thankyou for orderin" + item);
	 return 300.00;
	}
	if (item == "Frenchfries")
	{
	 System.out.println("Thankyou for orderin" + item);
	 return 50.00;
	}	
	
	if (item == "Pasteries")
	{
	 System.out.println("Thankyou for orderin" + item);
	 return 80.00;
	}
	return 0.0;
	}
	
	
	public static  double takeOrder(String item,int quantity)
	{
	
	if (item == "Piza")
	 {
	 System.out.println("Thankyou for orderin" + item);
	 return 250.00 * quantity;
	 }
	if (item == "Burger")
	{
	 System.out.println("Thankyou for orderin" + item);
	 return 60.00 * quantity;
	}
	if (item == "SouthIndian")
	{
	 System.out.println("Thankyou for orderin" + item);
	 return 300.00 * quantity;
	}
	if (item == "Frenchfries")
	{
	 System.out.println("Thankyou for orderin" + item);
	 return 50.00 * quantity;
	}	
	
	if (item == "Pasteries")
	{
	 System.out.println("Thankyou for orderin" + item);
	 return 80.00 * quantity;
	}
	return 0.0;
	}
	
} 