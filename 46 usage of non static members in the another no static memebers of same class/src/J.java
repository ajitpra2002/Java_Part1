//496
class J
{
	int i;
	void test()
	{
		i=10;//this.i = 10; , i is getting initialized with 10
	}
	public static void main(String[] args)
	{
		J j1 = new J();
		System.out.println(j1.i);
		j1.test();
		System.out.println(j1.i);
	}
}
