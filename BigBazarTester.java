class BigBazarTester
{
	public static void main(String a[])
	{
	BigBazar ref = new BigBazar();
	ref.branch = "Jpnagar";
	ref.gstNo = "AAA34553yy";
	ref.noOfWorkers = "112";
	System.out.println(ref.branch + " " + ref.noOfWorkers + " " + ref.gstNo);
	
	BigBazar big = ref;
	System.out.println(ref.branch + " " + ref.noOfWorkers + " " + ref.gstNo);
	
	}
}