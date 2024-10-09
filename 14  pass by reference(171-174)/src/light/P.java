package light;

public class P
{
	int i;
	static void test(P obj)
	{
		System.out.println("test:" + obj.i);
		 
		
	}
	public static void main(String[] args)
	{
		P p1 = new P();
		System.out.println("MAIN:" + p1.i);
		p1.i  = 10;
		System.out.println(p1.i);
		test(p1);
	}
}
