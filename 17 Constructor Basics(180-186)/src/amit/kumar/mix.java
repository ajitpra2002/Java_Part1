package amit.kumar;

public class mix {
	int id;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		mix s1 = new mix();
		mix s2 = new mix();
		s1.display();
		s2.display();
	}
}
