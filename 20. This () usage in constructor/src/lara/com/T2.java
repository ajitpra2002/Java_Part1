package lara.com;

public class T2
{
	int i;

	T2()
	{
		this(20, 10);
		System.out.println("t()");
		i = 10;
	}

	T2(int i, int j)
	{
		// this();
		System.out.println(i + ", " + j);
	}

	public static void main(String[] args)
	{
		T2 T2 = new T2();

		System.out.println(T2.i);

	}

}
