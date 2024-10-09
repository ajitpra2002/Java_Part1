package lara;

public class ZF
{
	static void test(int i)
	{
		System.out.println("test:" + i);
		 i=10;
		 System.out.println("test:" + i);
	}
	public static void main(String[] args)
	{
		int i = 20;
		System.out.println("main begin:" + i);
		test(i);
		System.out.println("main end");
	}
}
