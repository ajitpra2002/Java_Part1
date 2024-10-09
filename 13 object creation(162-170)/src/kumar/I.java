package kumar;

public class I
{
	int x = 100;

	static void test()
	{
		I rv = new I();
		System.out.println(rv.x);
	}

	public static void main(String[] args)
	{
		
		test();
		System.out.println("done");
		//System.out.println(rv.x);//it can not access object 
	}
}
