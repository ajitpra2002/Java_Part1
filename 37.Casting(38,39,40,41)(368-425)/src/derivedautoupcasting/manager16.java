//410
package derivedautoupcasting;
class Manager16
{
	public static void main(String[] args) 
	{
		B b1=new D();//autoupcasting
		C c1=(C)b1;  // downcasting explicit
		System.out.println("done");
	}
}
