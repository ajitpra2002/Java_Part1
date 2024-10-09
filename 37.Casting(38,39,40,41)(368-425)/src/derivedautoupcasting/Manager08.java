//402
package derivedautoupcasting;
public class Manager08
{
	static void test(A a1)
	{
		System.out.println("form test:");
	}
	public static void main(String[] args)
	{
		test( (A)new B());
		test(new C());
		test(new D());
		
		//B ,C,D ALL THREE ARE UPCASTED IN A TYPE BECAUSE TEST() REQUIRED A TYPE OF ARGUMENT
		//before calling test()method B,C,D should be upcasted into A type
		B b1 = new B();
		
		test(b1);//upcasted into A type
		D d1 = new D();
		
		test(d1);//upcasted into A type
		System.out.println("done");
	}
}
