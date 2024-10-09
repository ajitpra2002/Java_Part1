package amit.kumar;

public class Z
{
	static int i = test();// 15
	static int j = 15;

	static int test()
	{
		System.out.println("From test ->i "+i);
		System.out.println("From test ->j "+j);
		return j;

	}

	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
	}
}
