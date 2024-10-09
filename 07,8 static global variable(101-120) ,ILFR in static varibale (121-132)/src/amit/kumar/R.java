package amit.kumar;

public class R
{
	static int i = 10;
	static int j = i;

	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
	}
}
/*
 * uses of i is proper with forward reference i.e we are initializing the i
 * value to j
 */