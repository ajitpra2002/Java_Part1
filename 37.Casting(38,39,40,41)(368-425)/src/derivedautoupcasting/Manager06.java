//400
package derivedautoupcasting;
class Manager06 
{
	public static void main(String[] args) 
	{
		A a1= new C();
		Object o2=new D();
		//Object o1=(Object)(A)(B)(C)new D();//by manually
		B b1=new C();  
		C c1=new D();
		B b2=new D();
	    System.out.println("lara");
	}
}
/*
RHS IS THE SUBCLASS THEN COMPILER WILL DO UPCASTING AUTOMATICALLY
*/