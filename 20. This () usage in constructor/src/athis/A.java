//Uses of this without this.

package lara.athis;

public class A {
	int rollno;
	String name;
	float fee;

	A(int rollno, String name, float fee) {
		rollno = rollno;
		 name = name;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String args[]) {
		A s1 = new A(111, "ankit", 5000f);
		A s2 = new A(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
/*
output
0 null 0.0
0 null 0.0

1) this: to refer current class instance variable

The this keyword can be used to refer current class instance variable. 
If there is ambiguity between the instance variables and parameters, 
	this keyword resolves the problem of ambiguity. 


In the above example, parameters (formal arguments) and instance variables are same. 
So, we will using this keyword to distinguish local variable and instance variable
in upcoming program.
 
*/
