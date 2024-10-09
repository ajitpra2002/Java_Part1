//494
class H
{
	void test()
	{
		System.out.println("test:"+ this);
		
	}
	public static void main(String[] args)
	{
		H h1= new H();
		System.out.println("main:" + h1);
		h1.test();
	}
}
/*
this is nothing but h1 that is why main and test output is same

main:H@df5cbd6
test:H@df5cbd6

*/