 class LeapYear
 {
 static boolean checkYear(int year)
 {
	 if(year % 400 == 0 )
		 return true;
	 if(year % 100 == 0)
		 return false;
	 if(year % 4 == 0)
		 return true;
	 return false;
 }
 public static void main(String[] args)
 {
	int year = 2000;
System.out.println(checkYear(2000)? "Leap Year" :"Not a Leap Year");	
	 
 }
 }