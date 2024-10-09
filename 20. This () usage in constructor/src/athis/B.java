package lara.athis;

public class B {
	int rollno;
	String name;
	float fee;

	B(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String args[]) {
		B s1 = new B(111, "ankit", 5000f);
		B s2 = new B(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}

/*
To distinguish local variable and instance variable use this keyword

If local variables(formal arguments) and instance variables are different, 
	there is no need to use this keyword like in the following program:
*/