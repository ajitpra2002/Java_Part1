package com.overloading;

//Constructors overloading - Multiple constructors in a class
public class A{
	//class name and constructors name are same

	//empty constructor
	A()
	{
	}
	
	/*constructors with different data types with same number of argument*/
	A(int a){
	}
	A(double b){
	}
	
	/*constructors with with different number of arguments*/
	A(int a, int b){}
	A(int a ,int b, double c){}
}

/*
Java allows method overloading. In the same manner, the programmer can do constructor overloading in java. 
	A constructor can also be overloaded as a method. 
		We can overload the constructor with different parameter lists. 
			We can arrange the constructors in a way that each constructor performs a different task. 
				The compiler is differentiated by the number of parameters in the list and their types.

*/
