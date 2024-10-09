package lara.com;

public class T5 {
	
	int sid;
	String sname;
	int marks;
	
	public T5(T5 t5) {
		this.sid=t5.sid;
		 this.sname=t5.sname;
		 this.marks=t5.marks;
	}
	
	public T5(int sid,String sname, int marks) {
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
		T5 t5 = new T5(111, "Amit", 70);
		//T5 t6 = new T5(t5);
		t5.display();
	}
}
