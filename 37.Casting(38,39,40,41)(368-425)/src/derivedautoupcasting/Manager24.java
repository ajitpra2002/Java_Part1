//418
package derivedautoupcasting;
class Manager24 
{
	public static void main(String[] args) 
	{
		A a1=new B();// 1 step upcasting
		System.out.println(11);
		B b1=(B)a1;//1 step down casting is allow 
		System.out.println(22);
		//C c1=(C)a1;   ///not donedown casting, gives class cast exception
		System.out.println(22);
	}
}
