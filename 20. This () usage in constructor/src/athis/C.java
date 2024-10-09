package lara.athis;

public class C {
	int rollno;
	String name;
	float fee;

	C(int rllno, String nme, float fi) {
		rollno = rllno;
		name = nme;
		fee = fi;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String args[]) {
		C s1 = new C(111, "ankit", 5000f);
		C s2 = new C(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
/*
If local variables(formal arguments) and instance variables are different, 
	there is no need to use this keyword like in the following program:
Note:
It is better approach to use meaningful names for variables. 
	So we use same name for instance variables and parameters in real time, 
	and always use this keyword.
*/