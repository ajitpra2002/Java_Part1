package light;

public class PRA
{
	static   void test(int i)
	{
		System.out.println("test method:"+i );
	}
	public static void main(String[] args)
	{
		int i = 10;
		System.out.println(i);
		test(2);
		System.out.println("main method end:");
	}
}
