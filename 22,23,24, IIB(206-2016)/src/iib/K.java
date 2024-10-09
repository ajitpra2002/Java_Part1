package iib;

public class K
{
	K()
	{
		System.out.println("K()");
	}

	{
		System.out.println("IIB1");
	}

	K(int i)
	{
	}

	K(int i, int j)
	{
		this();
		System.out.println("k(int, int)");
	}

	static
	{
		System.out.println("SIB2");
	}

	public static void main(String[] args)
	{
		K k1 = new K();
		System.out.println(".............");
		K k2 = new K(100);
		System.out.println(".............");
		K k3 = new K(100, 200);
		System.out.println("..............");

	}
}
