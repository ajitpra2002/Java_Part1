//414
package derivedautoupcasting;

public class Manager20
{
	static C test()
	{
		A a1 = new D();
		//return a1;
		 return (C)a1;
	}
	public static void main(String[] args)
	{
		//D d1 = test();
		D d1 =(D) test();
		System.out.println("done");
	}
}
