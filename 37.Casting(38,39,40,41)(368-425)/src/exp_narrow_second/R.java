package exp_narrow_second;

class R
{
	static void test(int i)
	{
		System.out.println("test:" + i);
	}
	public static void main(String[] args)
	{
		byte b = 10;
		double d1 = 20.8;
		test(b);
		test((int)d1);
		System.out.println("done");
	}
}
