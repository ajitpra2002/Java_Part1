
//411
package derivedautoupcasting;
class Manager17
{
	public static void main(String[] args) 
	{
		A a1=(A)(B)(C)new D();//auto =3
		B b1=(B)a1;//exp
		C c1=(C)b1;//exp
		D d1=(D)a1;//exp
		System.out.println("done");
	}
}

/*
A a1=new D();
three step upcasting are happening in the above stmt.
then we are ellible for upto three step downcasting.


*/