package lara.com;

public class T1
{
	int i;

	T1()
	{
		System.out.println("t()");
		i = 10;
	}

	T1(int i)
	{
		this();
		System.out.println("f(int)");
	}

	public static void main(String[] args)
	{
		T1 t1 = new T1();
		System.out.println("...........");
		T1 t2 = new T1(20);
		System.out.println(t1.i + " ," + t2.i);

	}

}
