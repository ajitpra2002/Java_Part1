package lara;

public class ZA
{
	static void test(int i)
	{
		System.out.println("from test");
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		System.out.println("form main begin");
		//test();
		test(2);
		System.out.println("from main end");
	}
}
