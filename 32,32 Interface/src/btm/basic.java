import java.util.Scanner;

/*basic 
interface is just like a class which contain only abstract method.
in interface no any method implemented
to achieve interface java provides a keyword called  implement.
1.-->interface method are by default contain public and abstract.
example:-
if we write
interface ajit                  interface aijt
{                              { 
	void mi();       -->>        public abstract void mi();  
}                                )
it contain public & abstract it is because outside the interface we should implement our method.
2.-->interface veriable are by default take public+static+final.
interface                            interface
{                                  {
	int a;      -->                public static final int a;
}                                   }
 3.-->interface method that is mi it mentediory  to implementing inside the sub class .
inside the sub class if  method is not implemented then this sub class is make abstract class. 
4.-->interface nothinng but deals between clint and developer.
interface can achive 100% abstraction.because each and every method or veriable is implemented.
*/
interface client
{
	void input();
	void output();
}
class Ajit implements client //ajit is developer 
{
	String name;
	double salary;
	//void input()
	public void input()
	{
		Scanner r=new Scanner(System.in);
		System.out.println("please enter name::");
		name=r.nextLine();//nextline method is inside the scanner method it takes string.
		System.out.println("please  salary::"); 
		salary=r.nextDouble();//nextdouble method is inside the scanner method it takes string.
	}
	public void output()
	{
		System.out.println(name  +"" + salary);
	}
	public static void main(String [] args)
	{
	client c=new Ajit();
	c.input();
	c.output();
	}
 }