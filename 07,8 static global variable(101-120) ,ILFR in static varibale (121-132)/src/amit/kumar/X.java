package amit.kumar;

public class X
{
	static int test1()
	{
		return 1;
	}

	static int i = test1() + test2();
	                

	static int test2()
	{
		System.out.println("i->"+i);
		return 2;
	}

	public static void main(String[] args)
	{
		System.out.println(i);
	}
}
