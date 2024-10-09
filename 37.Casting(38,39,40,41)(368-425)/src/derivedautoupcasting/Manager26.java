
//420
package derivedautoupcasting;

class Manager26 
{
	public static void main(String[] args) 
	{
		A a1=new B(); //up castin
		B b1=(B)a1;  ///down casting
		System.out.println("-----");
		
		A a2=new A(); //no casting
		//B b2=(B)a2;  //CCEX
	}
}
