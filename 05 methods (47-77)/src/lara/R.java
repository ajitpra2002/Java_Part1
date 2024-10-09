package lara;

public class R
{
	static int test()
	{
		System.out.println("from test");
		return 100;// remove the return
		// return value is required
	}
	public static void main(String[] args)
	{
		System.out.println("from main");
		System.out.println(test());
		test(); 
	}
}
