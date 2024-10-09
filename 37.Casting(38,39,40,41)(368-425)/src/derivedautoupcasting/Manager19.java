//413
package derivedautoupcasting;

public class Manager19
{
	static void test(B b1)
	{
		System.out.println("from test(B)");
	}
	public static void main(String[] args)
	{
		A a1 = new B();//1 step upcasting
		test((B)a1);//1 step downcasting
		System.out.println("hello world");
	}
}
