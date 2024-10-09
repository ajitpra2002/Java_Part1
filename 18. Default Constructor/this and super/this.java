oi//************************//
//---------THIS key word---------
//----this is a keyword which refers to the current object inside instance method or costructor.
//This is always use inside the mathod or constractor.
/*
----when the name of instance and local variable both are same then this keyword is use.
because our jvm gets confused that which one is local veriable and which one is instance veriable.
this will gives ambiguity situation, to avoid this problem we should use this keyword.

*/
class A
{
	void test()
	{
	System.out.println(this);
	}
	public static void main(String[] args)
	{
		A r=new A();
		System.out.println(r);
	}
	
}
// so its output give both same for r or this.
// so now its prove this is showing current object.
class A{
	int a;//instance veriabale
	A(int a)//local veriable
	{
	a=a;
	}
	void test()
	{
	System.out.println(a);
	}
	public static void main(String[] args){
	 A r=new A(100);
	 r.test();
	}
}
//its output is 0 so here jvm will confused for both a
//so its print its defoult value i.e..0;
//if you want to print 100 that is passing in the costructor so inside constructer we have to use this.
class A{
	int a;//instance veriabale
	A(int a)//local veriable
	{
	this.a=a;//here this.a is instance veriable .
	}
	void test()
	{
	System.out.println(a);
	}
	public static void main(String[] args){
	 A r=new A(100);
	 r.test();
	}
}
//here output is 100.
//here this.a is instance veriable it is because this is use for current object only this.a-> is current object.
/*
----********this is also used when we want to call the default constructor of its own class
*/
class A{
	A()
	{
		System.out.println("default constractor");
		 
	}
	A(int a)
	{
	this();//it is calling default constractor in same class
	System.out.println(a);
	}
	public static void main(String[] args){
	A a=new A(100);
	}

}
/*
It also called parametrize constructor of its same class
*/
class A{
	A()
	{
		 this(100);//here calling of parametrize constractor.
	}
	A(int a)
	{
	System.out.println(a);
	}
	public static void main(String[] args){
	A a=new A();
	}

}
//////////usese of ------------------this-------
package lara.com;

public class T {
	int i;

	T() 
	{
		System.out.println("t()");
		i = 10;
	}

	T(int i) 
	{
		this();
		System.out.println("f(int)");
	}

	public static void main(String[] args) {
		T t1 = new T();
		System.out.println("...........");
		T t2 = new T(20);
		System.out.println(t1.i + " ," + t2.i);

	}

}


package lara.com;

public class M {

	M()
	{
		System.out.println("n()");
	}

	M(int i) 
	{
		this();
		System.out.println("n(int)");
	}

	public static void main(String[] args) {
		M n1 = new M();
		System.out.println("........");
		M n2 = new M(10);
		System.out.println(".........");

	}

}
public class Th2 {
	Th2() 
	{
		System.out.println("DEFOULT CONSTRUCTOR WIHTOUT PARAMETER");
	}

	Th2(int i) 
	{
		this();
		System.out.println("TH2");
	}

	public static void main(String[] args) {
		Th2 th = new Th2(2);
		Th2 th1 = new Th2();
	}
}











