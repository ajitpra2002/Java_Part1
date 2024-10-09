
import javax.print.attribute.SetOfIntegerSyntax;

//**********Abstraction *********
// Abstraction is a process of hiding the implementation detail from the user.
//Only highlights set of services provided to the user.
//Abstraction gives security .
//There are two way to achieve Abstraction.
//1.Abstract=0-100%
//2.Interface=100%
/*
 abstract is a keyword
 
-->A class which contain the abstract keyword in its declaration 
is called abstract class.
*******abstract class A
      {
      }******* this class is called abstract class
--> we can not create object for abstract class     
*/
abstract class ajit
{
	}
class A
{
public static void main(String[] args) {
	ajit k=new ajit();
	}
}

// it gives cte.
// But we can create reference of the abstract class.
//with the help of sub class 
abstract class ajit
{
	//it is super class
}
class aman extends ajit
{
	//sub class
}
class A
{
public static void main(String[] args) {
	ajit k=new aman();//any super class is capable to store sub class object.
	 
}
}
/*
 -->abstract it may or may not be contain abstract method.
 -->it can have abstract and non abstract method (constractor,mathod m1,m2)
 -->to use an abstract class(super class ko inherit karna hoga sub class me) 
 you have to inherite it from sub class.
--> // if a class contain partial implemented then we should delare a class abstract.
 there are two way when use abstract
 1.
         class A{                                    abstract class A{
          public void main(String[] args){
		         }                                   -------> public void main(String[] args);
         }                                               }
         
2. 
 			class A{                                    abstract class A{
           abstract  void m2();              ------->   abstract  void m2();    
         }                                               }
         
 ******if any abstract method inside the class then it mandatory to create class as abstract.       
*/
//example of abstract classes

abstract class bike{
		abstract void run();//super class
	
}
class honda extends bike{//sub class
	void run()
	{
		System.out.println("i am honda");
	}
			public static void main(String[] args)
			{
			bike b=new honda();
			b.run();
		}
}

//******************
abstract class animal
{
	
	 animal()
	{
		System.out.println("All animals");
	}

	abstract void sound();
	
}
class Dog extends animal{		
/*Dog()
	{
	super();
	}
*/
	void sound() {
		System.out.println("Dogs breaks");
	}
}
class lion extends animal{
		void sound()
		{
			System.out.println("lion is roar");
		}
		
	}
class test{	
	public static void main(String[] args) {
		Dog d=new Dog() ;
		lion l=new lion();
		d.sound();
		l.sound();
		
	}
}
//*******&&&&&&&*********



