package kumar;

 class D
{
	 static void test1()
	 //void test1()
	{
		System.out.println("FROM TEST1");
	}
	static void test2()
	//void test2()
	{
		test1();
		System.out.println("test test2");
	}
}

// remove the static from the test1() method.then it give CTE..
