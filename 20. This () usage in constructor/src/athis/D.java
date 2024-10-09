package lara.athis;

public class D {
	void hello() {
		System.out.println("hello");
	}

	void how() {
		System.out.println("how");
		// hello();//same as this.hello()
		this.hello();
	}
	public static void main(String args[]){  
		D d=new D();  
		d.how();  
	}
}

/*
2) this: to invoke current class method
We may invoke the method of the current class by using the this keyword. 
	If we don't use the this keyword, compiler automatically adds this keyword 
	while invoking the method. Let's see the example
*/