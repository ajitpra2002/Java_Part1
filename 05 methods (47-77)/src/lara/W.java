package lara;

public class W
{
	//static void test()
	static int test()
	{
		System.out.println("from test");
		return 0;//remove the return then check.
	}
	public static void main(String[] args)
	{
		int i = 10 + test();//test() return some value but test() is void type
		System.out.println(i);
	}
}
