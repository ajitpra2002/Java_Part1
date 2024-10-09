//397
package derivedautoupcasting;
class Manager03  
{
	public static void main(String [] args)
	{
		Object obj=null;
		A a1=null;
		A a2=null;
		a1=a2;//homogeneous assignment
		
		
		B b1=null;
		B b2=null;
		b2=b1;//homo
		
		
		C c1=null;
		C c2=null;
		c1=c2;//homo
		
		
		D d1=null;
		D d2=null;
		d2=d1;//homo
		
		a2=new A();
		obj=new Object();
		c1=new C();
		d1=d2;
		d2=new D();
		b1=new B();
		System.out.println("done");
		//in all homogenous assignment
	
	}
	
}
