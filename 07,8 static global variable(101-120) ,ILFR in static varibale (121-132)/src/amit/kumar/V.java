package amit.kumar;

public class V
{
	static int i = 10;
	
	
	
	static int j =i;
	//static int m = n;
	//illegal forward reference varibel
	static int n = j;
	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
		//System.out.println(m);
		System.out.println(n);
	}
}
