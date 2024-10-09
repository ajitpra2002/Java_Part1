package iib;

public class B {
	int k;
	B() {
		System.out.println("B()");
	}

	{
		k=100;
		System.out.println("IIB");
	}

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println("........"+b1.k);
		B b2 = new B();
		System.out.println(".........");
	}
}
 