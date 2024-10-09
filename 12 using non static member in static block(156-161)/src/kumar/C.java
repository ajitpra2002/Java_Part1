package kumar;

 class C
{
	 static int i ;
	 //int i;
	static void test()
	{
		System.out.println(i);
	}
}
// remove the static , then it gives the CTE 
// BCZ non static variable  i can not be referenced from a
//static context.