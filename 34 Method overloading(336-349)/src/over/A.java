package over;
//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
abstract class A
{
	abstract void test1();// abstract method
}
abstract class B extends A
{
	//test1() method is inherited inside the class B, but it is not implemented, due to this
	// Class B is abstract class
	void test1(double b)//Concrete method
	{
		System.out.println("from testi double");
	}
	void test1(int i) {
		System.out.println("i am in int type");
	}
}
class C1 extends B
{
	//class A test1()and Class B test1() both are inherit into the class C1
	void test1()
	{
		System.out.println("from test1 of class A");
	}
	public static void main(String[] args)
	{
		C1 c1 = new C1();
		c1.test1();
		c1.test1(10.8899);
		c1.test1(55);
	}
}
