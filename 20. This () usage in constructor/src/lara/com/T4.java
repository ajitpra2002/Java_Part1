//Assign value to instance variable [Constructor vs Method]
package lara.com;

public class T4 {
	
	int sid;
	String sname;
	int marks;
	
	public T4(int sid,String sname, int marks) {
		 this.sid=sid;
		 this.sname=sname;
		 this.marks=marks;
	}
	
	public void assign(int sid,String sname, int marks) {
		 this.sid=sid;
		 this.sname=sname;
		 this.marks=marks;
	}
	
	void display() {
		System.out.println("--------------");
		System.out.println("Name : "+sname);
		System.out.println("Sid : "+sid);
		System.out.println("Marks : "+marks);
	}
	public static void main(String[] args) {
		T4 t4 = new T4(111, "Amit", 70);
		t4.assign(101, "Ajit", 75);
		t4.display();
	}
}

/*
Constructor  	-  it is initializing instance variable during object creation.
Method 			-  it is initializing instance variable when we call that method.

*/



