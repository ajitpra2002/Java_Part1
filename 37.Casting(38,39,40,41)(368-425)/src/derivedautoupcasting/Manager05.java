//395
package derivedautoupcasting;
class Manager05 
{
	public static void main(String[] args) 
	{
		A a1=new B();  //(A)new B(); upcasting
		B b1=new C();  //same above
		C c1=new D();  //same avbove
		Object o1=new A();
		System.out.println("done");
	
	 
	}
}
