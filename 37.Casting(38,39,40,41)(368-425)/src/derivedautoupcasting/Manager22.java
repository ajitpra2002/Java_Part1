//416
package derivedautoupcasting;

public class Manager22
{
	public static void main(String[] args) 
	{
		A a1=new B();//1 step upcasting
		B b1=(B)a1;//1 step downcasting
		
		System.out.println("------");
		A a2=new A();
		//B b2=(B)a2;//RTE
		//C c1 = (C)a1;//RTE
		//D d1 = (D)a1;//RTE
		System.out.println("------");
	}
}
/*
object of A i.e a2 does not have any B related memeber
a1 is only eligible for 1 step downcasting i.e B type


*/