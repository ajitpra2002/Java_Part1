package amit;

public class J
{
	static void test(double d1, char c1)
	{
		System.out.println("from test");
		System.out.println(d1);
		System.out.println(c1);
	}
	public static void main(String[] args)
	{
		System.out.println("form mian");
		test(90.9090,'a');
		double v1=89.0909;
		char v2 = 's';
		test(v1,v2);
	}
}
