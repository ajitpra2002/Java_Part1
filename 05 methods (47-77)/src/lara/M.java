package lara;

public class M
{
	static int test()
	{
		System.out.println("test begin");
		if(100==100)
		{
			System.out.println("from if");
			return 0;
		}
		System.out.println("test end");
		return 0;
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		//int k;
		System.out.println(test());
		System.out.println("main end");
	}
}
