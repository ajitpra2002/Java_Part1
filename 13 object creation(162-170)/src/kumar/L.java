package kumar;

public class L
{
	void test1()
	{
		System.out.println("from test1");
	}

	static
	{
		L obj = new L();
		obj.test1();
	}

	public static void main(String[] args)
	{
		System.out.println("From Main Method");
	}
}
