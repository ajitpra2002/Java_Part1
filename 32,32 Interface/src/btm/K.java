package btm;

interface K {
	void test1();
}

interface Z {
	void test3();
}

interface L extends K, Z {
	void test2();
}

class M implements L {
	public void test1() {
		System.out.println("from test1()");
	}

	public void test2() {
		System.out.println("from test2()");
	}

	public static void main(String[] args) {
		M obj = new M();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}

	public void test3() {
		// TODO Auto-generated method stub

	}
}
