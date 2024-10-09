package in;

public class ZBaseClass {
	void foo() {
		System.out.println("In BaseClass.foo()");
	}

	void bar() {
		System.out.println("In BaseClass.bar()");
	}

	public static void main(String[] args) {
		//DerivedClass po = new DerivedClass(); // Case 1
		ZBaseClass po = new DerivedClass();   //Case 2
		po.foo();
		po.bar();
		//po.jar();
		System.out.println("Main End");
	}

}

class DerivedClass extends ZBaseClass {
	void foo() {
		System.out.println("In Derived.foo()");
	}

	void bar() {
		System.out.println("In Derived.bar()");
	}
	
	void jar() {
		System.out.println("In Derived.bar()");
	}
}
/*
Imp : Case 1
Output 
In Derived.foo()
In Derived.bar()
In Derived.bar()
Main End

We are simply creating the object of DerivedClass and assigning back to same class reference
 	and calling the over ride method

Case 2 : Comment case 1 and uncomment case 2
In Derived.foo()
In Derived.bar()
Main End
DerivedClass is child class of ZBaseClass so ZBaseClass become parents class
	and ZBaseClass can hold the reference of its child.
	But only overriden method can be called
	if you add any other method in the child class then by using the above it can not 
	be called.
	it will say "The method jar() is undefined for the type ZBaseClass"
*/
