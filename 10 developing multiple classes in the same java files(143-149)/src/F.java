public class F
{
	static int i = 12;
	public static void main(String[] args)
	{
		System.out.println("from main:" + i);
		System.out.println("from main:" + F.i);
	}
}

class G
{
	public static void main(String[] args)
	{
		System.out.println("from main:" + F.i);
	}
}

