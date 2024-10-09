package iib;

public class C
{
	C()
	{
		System.out.println("C()");
	}

	{
		System.out.println("IIB");
	}

	C(int i)
	{
		super();
		System.out.println("C(INT)");
	}

	public static void main(String[] args)
	{
		
		System.out.println("..........");
		C c1 = new C();
		C c2 = new C(20);
		System.out.println("'''''''''");
	}
}
