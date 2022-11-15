class SwiggyyTester
{
	public static void main(String a[])
	{
	double itemPrice = Swiggyy.takeOrder("Pasteries");
	System.out.println("The item price is " + itemPrice);
	
	double itemPriceWithQuantity = Swiggyy.takeOrder("Pasteries",12);
	System.out.println("The item price is " + itemPrice);
	
	System.out.println("Your Final is ready enjoy" );
	
	}




}