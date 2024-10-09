package primitiveautowidening;

class Manager6
{
	static float test1(byte b)
	{
		long lon =test2(b);
		return lon;
	}
	static int test2(short s)
	{
		return s;
	}
	public static void main(String[] args)
	{
		byte b = 10;
		double d = test1(b);
		System.out.println("done");
	}
}
