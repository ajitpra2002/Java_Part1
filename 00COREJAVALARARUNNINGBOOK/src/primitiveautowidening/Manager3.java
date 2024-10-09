package primitiveautowidening;

class Manager3
{
	static void test(double d)
	{
		System.out.println("double");
	}
	public static void main(String[] args)
	{
		int i = 100;
		test(i);
		//test((double)i);
		System.out.println("done");
	}
}
