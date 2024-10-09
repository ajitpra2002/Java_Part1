package lara.athis;

public class L {
	
	public void display() {
		System.out.println("Printing this::"+this);
	}
	public static void main(String[] args) {
		L l = new L();
		l.display();
		System.out.println("Printing L object ref :"+l);
	}
}
/*

Proving this keyword
Whether this keyword refers to the current class instance variable or not
*/
