//417
package derivedautoupcasting;
class Manager23 
{
	public static void main(String[] args) 
	{
		A a1 = new C(); 
		//A a1=new D();//three step downcasting is happend
		System.out.println(11);
		B b1=(B)a1;
		System.out.println(22);
		C c1=(C)(B)a1;
		System.out.println(22);
		//D d1 = (D)a1;//RTE WHY 3step upcasting is required.
		System.out.println(33);
	}
}

/*
without upcasting we can not do downcasting

if two steps are upcasted then only two steps is down casted is allow

*/