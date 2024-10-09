package lara.com;

class B {
	public B(int i) {
		System.out.println("B()");
	}
}

public class This1 extends B {
	This1() {
		super(4);
		System.out.println("This1()");
	}

	This1(int i) {
		super(5);
		System.out.println("This1(int i)");
	}

	public static void main(String[] args) {
		This1 t1 = new This1(3);
		This1 t2 = new This1();
	}
}
