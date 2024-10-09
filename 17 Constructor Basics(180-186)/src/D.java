
class D
{
	D()
	{
		System.out.println("d constructor");
	}
	D(int i)
	{
		System.out.println("m(int i)");
	}
	public static void main(String[] args)
	{
		
		D d2 = new D();
		System.out.println("............");
		D d1 = new D(10);
		System.out.println("............");
	}
}
