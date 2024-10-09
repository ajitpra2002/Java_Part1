package lara.com;

public class M {

	M() {
		System.out.println("n()");
	}

	M(int i) {
		this();
		System.out.println("n(int)");
	}

	public static void main(String[] args) {
		//M n1 = new M();
		System.out.println("........");
		M n2 = new M(10);
		System.out.println(".........");

	}

}
