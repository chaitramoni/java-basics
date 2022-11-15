
public class BlockTester {
	public int id;
	public String name;
	public BlockTester(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	static {
		System.out.println("static blocks are executed");
			}
	{
		System.out.println("Instance bolcks are created");
	}
	
	public static void method()
	{
		System.out.println("method of tester class");
	}
	
	public static void main (String a[])
	{
		System.out.println("main method started");
	}
	BlockTester test = new BlockTester(1,"Somename");
	System.out.println(test.name + " " +  test.id);
	System.out.println("main method ended");
	

}
