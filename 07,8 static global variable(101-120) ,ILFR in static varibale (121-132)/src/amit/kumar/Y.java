package amit.kumar;

public class Y
{
	static int i = 100;
	static int j = test();// 100

	static int test()
	{
		return i;
	}

	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
	}
}
