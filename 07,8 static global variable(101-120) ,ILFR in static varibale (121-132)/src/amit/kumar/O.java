package amit.kumar;

public class O
{
	static int i;

	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(O.i);// optional
		i = 10;
		System.out.println(O.i);
	}

}
