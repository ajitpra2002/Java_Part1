//218
package in;

public class C {
	int i;

	void test1() {
		System.out.println("from test1");
	}

	public static void main(String[] args) {
		System.out.println("eruyyfyu");

	}
}

class D extends C {
	int j;

	void test2() {
		System.out.println("from test2");
	}

	public static void main(String[] args) {
		D d1 = new D();
		d1.test1();
		d1.test2();
		System.out.println("........");
		d1.i = 10;
		d1.j = 20;
		System.out.println(d1.i + "," + d1.j);
	}
}
