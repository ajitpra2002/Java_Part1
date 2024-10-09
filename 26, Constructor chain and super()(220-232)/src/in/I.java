//220
package in;
class I
{
	I()
	{
		System.out.println("I()");
	}
}
class J extends I
{
		J()
		{
			//super();//by default compiler keep super keyword at the time of compiler.
			//calling the default constructor of I class
			System.out.println("J()");
		}
}
class K
{
	public static void main(String[] args)
	{
		I obj1= new I();
		System.out.println(".......");
		J obj =new J();
		System.out.println(".......");
	}
}