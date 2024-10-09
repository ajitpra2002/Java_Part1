
//411
package derivedautoupcasting;
class Manager18
{
	static void test(B b1)
	{
	  System.out.println("from test1(B)");
	}
	
	
	public static void main(String[] args) 
	{
		A a1=new B();//aupcasting
		//test1(a1);
		test((B)a1);//exp downcasting
	  System.out.println("done");
	}
}
