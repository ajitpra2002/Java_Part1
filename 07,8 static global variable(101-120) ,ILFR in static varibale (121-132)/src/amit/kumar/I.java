package amit.kumar;

public class I
{
	static int i;

	static void test()
	{
		System.out.println("FROM TEST :" + i);
		i = 10;
	}

	public static void main(String[] args)
	{
		System.out.println("main1:" + i);
		i = 20;
		test();
		System.out.println("MAIN2:" + i);

	}

}
