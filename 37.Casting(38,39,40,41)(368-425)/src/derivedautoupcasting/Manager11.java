//405
package derivedautoupcasting;

public class Manager11
{
	static A test1(C c1)
	{
		return test2(c1);
	}
	
	
	static B test2(C c1)
	{
		return c1;
	}
	
	public static void main(String[] args)
	{
		D d1 = new D();
		Object o1 = test1(d1);
		System.out.println("done");
	}
}

/*
calling test1(d1) we are supplying d1 but test1()requied C TYPE of argument so  before calling 
test1(), di is upcasted into C type of argument.
form body of test1(), it is calling test2()
....
..
..
*/