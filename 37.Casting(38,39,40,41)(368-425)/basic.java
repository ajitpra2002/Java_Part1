/*Type casting
 converting one data type into another data type
 there are two ways to casting
 1. implicit  2 .explicit
  there are two types of type casting
 Widening Casting (automatically) - converting a smaller data type to a larger data type size. 
 order--byte -> short -> char -> int -> long -> float -> double.(bsc in lfd)
 2 .explicit
 Narrowing Casting (manually) - converting a larger data type to a smaller size type.
 double -> float -> long -> int -> char -> short -> byte.
 
 There are two more casting
 upcasting and downcasting
 *****ek class ka object ko dusra class ka object me change karna
 --.>Upcasting and Downcasting is the type of object typecasting.
 -->the object can also be typecasted like the datatypes.
 -->Parent and Child objects are two types of objects.
 -->there are two types of typecasting possible for an object
 -->Parent to Child and Child to Parent or can say Upcasting and Downcasting.
 -->In Upcasting and Downcasting, we typecast a child object to a parent object and a parent object to a child object
 -->We can perform Upcasting implicitly or explicitly, but downcasting cannot be implicitly possible.
 -->                         
                    parent
					^    |
	      upcasting	|    |Downcasting
					|    ^
                    Child
--->in upcasting child object is typecasted to a parent class object.
-->using the Upcasting, we can easily access the variables and methods of the parent class in the child class
 --> Upcasting is also known as Generalization and Widening.
 -->Parent p = new Parent()
 */
/* 
 class  Parent{  
   void PrintData() {  
      System.out.println("method of parent class");  
   }  
}  
  
class Child extends Parent {  
   void PrintData() {  
      System.out.println("method of child class");  
   }  
}  
class ram extends Child{
	
}
class UpcastingExample{  
   public static void main(String args[]) {  
      Parent obj1 =   new child();  
      Parent obj2 =   new Child();
      Parent obj3=(Parent)(Child)new ram();
      obj1.PrintData();  
      obj2.PrintData();  
       
   }  
} 
*/ 
/*
Downcasting
first of all those no times of you upcasting that no you are able to downcast.
-->in downcasting we assign a parent class reference object to the child class.
-->The methods and variables of both the classes(parent and child) can be accessed.
-->Implicitly Downcasting is not possible.
Parent p = new Child()//upcasting
Child c = (Child)p;//downcasting
*/
 
 class Parent {   
    String name;   
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
}   
    
// Child class   
class Child extends Parent {   
    int age;   
    
    // Performing overriding  
    @Override  
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }   
}   
    
public class Downcasting{  
    
    public static void main(String[] args)   
    {   
        Parent p = new Child();  
        p.name = "Shubham";  
          
         Performing Downcasting Implicitly   
         //Child c = new Parent(); // it gives compile-time error   
          
        // Performing Downcasting Explicitly   
         Child c = (Child)p;   
    
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   
    }   
} 
*/ 