package over;

class K
{
//	private static void test()
//	{
//		System.out.println("from test");
//	}
//	protected int test()
//	{
//		System.out.println("from test protected ");
//		return 10;
//	}
}
//same signature  should not be in the same class



/*
inside a class or interface if two methods are having same signature then they are duplicate even those
have different return type and access modifier.
compiler does not allow the duplicate method inside the class or interface it will give CTE


*/
public class A
{
	  void add() //int
	{
	int a=20,b=30,c;
	c=a+b;
	System.out.println(c);
	//return c;
	}
	void add(int x,int y)
	{
	int c;
	c=x+y;
	System.out.println(c);
	}
	void add(int x,double y)
	{
	double c;
	c=x+y;
	System.out.println(c);
	}
	public static void main(String[] arg)
	{
	A a=new A();
	a.add();
	//int k=a.add();
	//System.out.println("add="k);
	a.add(100,200);
	a.add(100,200.45);
	}
}