
class B {
	static int i;

	B()// constructor
	{
		i = 10;// B.i=10;
		System.out.println("Constructor ()");
	}

	// IIB
	{
		i = 20;
		System.out.println("IIB");
	}
	// SIB
	static {
		i = 30;
		System.out.println("Static Block");
	}

	// non static method
	void test() {
		i = 40;
	}

	public static void main(String[] args) {
		B b = new B();
		System.out.println(i);
		i = 50;
		System.out.println(i);
	}
}
