
//406
package derivedautoupcasting;

public class Manager12
{
	public static void main(String[] args)
	{
		A a1 = (A)new B();//optional
		A a2 = new B();
		
		C c1 = new D();
		C c2 = (C) new D();//optional
		
		System.out.println("done");
		
	}
}

/*
subclass is upcasted into superclass by the compiler automaic


*/