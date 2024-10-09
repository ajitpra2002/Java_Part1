package amit.kumar;

public class H
{
	static int i;

	static void test()
	{
		System.out.println("FROM TEST :" + i);
	}

	public static void main(String[] args)
	{
		System.out.println("main:" + i);
		i = 10;
		test();
		System.out.println("main:" + i);

	}

}
