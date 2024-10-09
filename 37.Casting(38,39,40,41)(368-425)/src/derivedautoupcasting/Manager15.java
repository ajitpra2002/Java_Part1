//409
package derivedautoupcasting;

public class Manager15
{
	public static void main(String[] args)
	{
		B b1 = new D();//autoupcating
		C c1 = (C) b1;//explicit downcasting
		System.out.println("done");
	}
}
/*
where ever upcasting is happend there, downcasting may happend.
before downcasting, autoupcasting should be.

*/