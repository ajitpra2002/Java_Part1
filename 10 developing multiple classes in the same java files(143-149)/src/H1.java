 

 
class S
{
	static void test()
	{
		System.out.println("from test s");
	}
}
class R
{
	static int i=10  ;
	
	public static void main(String[] args)
	{
		 
	}
}
  class F4
{
	public static void main(String[] args)
	{
		System.out.println(R.i);
		S.test();
	}
}
