package lara.athis;

public class F {
	int rollno;
	String name, course;
	float fee;

	F(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	F(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
	
	public static void main(String args[]) {
		F s1 = new F(111, "ankit", "java");
		F s2 = new F(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}

}
/*
this() constructor call should be used to reuse the constructor from the constructor.
	It maintains the chain between the constructors i.e. 
	It is used for constructor chaining.
Rule: this() Constructor calling statement should be the first statements.
*/
