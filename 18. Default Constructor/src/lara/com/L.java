package lara.com;

public class L
{

	L(int i, int j)
	{
		System.out.println(" a");
		System.out.println(i);
		System.out.println(j);
	}

	L(int i, double j)
	{
		System.out.println("fkjdhjdhfjadh");
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args)
	{
		L obj1 = new L(10, 20);
		System.out.println("...........");
		L obj2 = new L(10, 2.0);
		System.out.println("............n");
	}

}
