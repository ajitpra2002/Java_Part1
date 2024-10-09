package primitiveautowidening;

class Manager5
{
	static float test()
	{
		int i=100;
		return i;
		//return (float)i;
	}
	public static void main(String[] args)
	{
		double d = test();
		System.out.println(d);
		System.out.println("done");
	}
}
