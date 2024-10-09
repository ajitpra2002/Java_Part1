
public abstract class F
{
	int i;
	abstract void test1(); 
	void test2()
	{
		System.out.println("from test2()");
	}
	
	public F() {
		// TODO Auto-generated constructor stub
	}
}
/*
--> abstract keyword
--> use along with class and method signature/method header
--> if class is abstract means that cls may have unimplemented method.
--> we can not able to create the obj of abstract cls.
-->when the class is concreate then we can able to create  the obj of that cls.
-->abst clss contains the cosntrcute.
-->by using the abst cls we can achieve 0-100% abstraction.
-->	Abst cls contains the concreate and abst method and non-static variable.
--> if we have paritial information about d the requirement then go for abstract class.
-->	
	
*/	
	

class G extends F
{
	void test1()
	{
		System.out.println("from test1()");
	}
	public static void main(String[] args)
	{
		//F f1 = new F();
		G g1 = new G();
		//f1.test1();
		//f1.test2();
		g1.test1();
		g1.test2();
		System.out.println("done");
		
	}
}
