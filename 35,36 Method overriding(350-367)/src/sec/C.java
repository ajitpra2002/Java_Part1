package sec;

class C
{
	double test()
	{
		System.out.println("from test");
		return 20.90;
	}
}
	class D extends C
	{
		//int test()
		double test()//overided method
		{
			System.out.println("from test");
			return 10.0;
		}
			public static void main(String[] args) {
				D d=new D();
				d.test();
			}
	}

//return type should be the same