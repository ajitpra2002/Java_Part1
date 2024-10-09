//401
package derivedautoupcasting;
class Manager07
{
	public static void main(String[] args) 
	{
		A a1=null;
		B b1=null;  
		C c1=null;
		D d1=null;
		
		
		a1=b1;
		b1=c1;
		c1=d1;
        Object o1=c1;
	    System.out.println("done");
	}
}
/*
RHS IS THE SUBCLASS THEN COMPILER WILL DO UPCASTING AUTOMATICALLY
*/