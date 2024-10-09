//182
package amit.kumar;

public class C
{
	int i;

	public C()
	{
		System.out.println("c()");
		i = 10;

	}

	public static void main(String[] args)
	{
		C c1 = new C();
		System.out.println(".............");
		System.out.println(c1.i);
	}

}
//what is the access specifier of constructor?
// access specifier of the constructor is the class access specifier
//Through constructor we are initialing i value to 10.
//all non static members are loading in the heap memory while object is crating 
//constructor also execute at that time also
//constructor is one of the initializer block all non static member will be initialize the
//constructor block