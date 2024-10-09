package lara.com;

public class T3
{

	T3()
	{	
		this(5);
		System.out.println("T3()");
	}
	T3(int i)
	{
		//T3();
		System.out.println("T3(int i)");
	}

	
	public static void main(String[] args)
	{
		T3 t = new T3();

	}

}
