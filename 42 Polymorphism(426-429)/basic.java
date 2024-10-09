/*
polymorphism meaning is same object having different behaviour
we can perform a single action in different ways.
there are two type of polymorphism
1> compile time polymorphism
2> Run time polymorphism

compile time polymorphism-->
A polymorphism which is exists at the time of compilation.
example->method overloading
*/
public class A{
	  void add() //int
	{
	int a=20,b=30,c;
	c=a+b;
	System.out.println(c);
	//return c;
	}
	void add(int x,int y)
	{
	int c;
	c=x+y;
	System.out.println(c);
	}
	void add(int x,double y)
	{
	double c;
	c=x+y;
	System.out.println(c);
	}
	public static void main(String[] arg)
	{
	A a=new A();
	a.add();
	//int k=a.add();
	//System.out.println("add="k);
	a.add(100,200);
	a.add(100,200.45);
	}
}
/*Run time polymorphism
A polymorphism which is exists at the time of run.
example->method overriding
*/

class shape{
     void draw()
	 {
	 System.out.println(" not any shape ");
	 }
}
class square extends shape
{
     void draw()
	 {
	 System.out.println("square ");
	 }
}
class A
{

public static void main(String[] args)
{    
	shape r=new square();
	 r.draw();
}
}


