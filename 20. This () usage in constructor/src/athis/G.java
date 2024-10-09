package lara.athis;

public class G {
	int rollno;
	String name;
	float fee;

	G(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		print(this);
	}
	
	void print(G g) {
		System.out.println(g.rollno + " " + g.name + " " + g.fee);
	}
	

	public static void main(String args[]) {
		G s1 = new G(111, "ankit", 5000f);
		G s2 = new G(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}

/*
4) this: to pass as an argument in the method

The this keyword can also be passed as an argument in the method. 
It is mainly used in the event handling.

Application of this that can be passed as an argument:
In event handling (or) in a situation where we have to provide 
reference of a class to another one. 
It is used to reuse one object in many methods.

*/
