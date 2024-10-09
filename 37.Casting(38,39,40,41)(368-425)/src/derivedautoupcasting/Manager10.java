//404
package derivedautoupcasting;
class Manager10 
{
	static C test()
	{
	D d1=new D();
	return d1; //(C)d1;d1 is upcasted into C type by the compiler
	}
	public static void main(String[] args) 
	{
		A a1=test();  //(A)c1,c1 is upcasted into A type by the compiler
		System.out.println("done");
	}
}

