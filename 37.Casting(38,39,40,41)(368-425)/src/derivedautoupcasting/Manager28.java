//422
package derivedautoupcasting;
class Manager28
{
	public static void main(String[] args) 
	{
		A a1=new D();  //up casting ..
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
		System.out.println(a1 instanceof D);
		
	}
}

/*

in this example a1 is the instace of A,B,C AND D
because of a1 is upcasted into 3 step 
that is why.

*/