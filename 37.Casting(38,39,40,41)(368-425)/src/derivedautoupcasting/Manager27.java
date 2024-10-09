//421
package derivedautoupcasting;
class Manager27 
{
	public static void main(String[] args) 
	{
		A a1=new B();  //up casting ..
		System.out.println(a1 instanceof A);//true
		System.out.println(a1 instanceof B);//true
		System.out.println(a1 instanceof C);//false
		System.out.println(a1 instanceof D);//false
		
	}
}
/*
instanceof is used to checking the object type through the reference varible
if the given reference varible is specified class type then it return true 
otherwise it return flase
a1 is the instance of A AND B ONLY

*/