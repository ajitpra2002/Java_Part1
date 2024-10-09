package kumar;

class B
{
	//static void test()
	 void test()
	{
		System.out.println("static");
	}
	public static void main(String[] args)
	{
		test();
		System.out.println("hello world");
	}
}
// if we write only void test() then compile will gives the error message
// bcz we are calling non static method in the static main method.