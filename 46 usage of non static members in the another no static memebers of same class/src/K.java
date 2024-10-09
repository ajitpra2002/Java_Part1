class K
{
	int i;
	void test()
	{
		//i=10;
		this.i=10;
		//k1.i=10;
	}
	void test2()
	{
		System.out.println("test2:" + i);
		//i=20;
		this.i=20;
		//k1.i=20
	}
	public static void main(String[] args)
	{
		K k1 = new K();
		System.out.println("main1:" + k1.i);
		k1.test();
		System.out.println("main2:" + k1.i);
		k1.test2();
		System.out.println("main3:" + k1.i);
	}
}
