package lara;

class L
{
	static void test()
	{
		System.out.println("from test begin");
		
		System.out.println("from test end");
		return;
	}
	public static void main(String[] args)
	{
		test();
		System.out.println(".........");
		test();
	}
}
