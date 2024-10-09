//223
package in;
class S
{
	S()
	{
		System.out.println("S()");
	}
}
class R1 extends S
{
	R1()
	{
		super();
		System.out.println("R()");
	}
}
class T extends R1
{
	T()
	{
		System.out.println("T()");
	}
}
class U
{
	public static void main(String[] args)
	{
		T t1 = new T();
		System.out.println("......");
		R1 r1 = new R1();
		System.out.println("......");
		S s1 = new S();
		System.out.println("......");
	}
}
