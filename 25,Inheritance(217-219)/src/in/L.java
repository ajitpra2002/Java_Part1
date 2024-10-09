//221
package in;
class L
{
	L()
	{
		System.out.println("L()");
	}
}
class M extends L
{
	M()
	{
		//super();
		//calling the default constructor of L class
		System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		//super();
		//calling the default constructor of M class
		System.out.println("N()");
	}
}
class O
{
		public static void main(String[] args)
		{
			L obj1 = new L();
			System.out.println("......");
			M  obj2 = new M();
			System.out.println(".......");
			N obj3 = new N();
			System.out.println(".......");
		}
}