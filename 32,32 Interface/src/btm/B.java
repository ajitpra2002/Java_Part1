package btm;

  interface A1 {
	void test1();
}

interface B1 {
	void test2();
	 
}

abstract class C {
	abstract void test3();
	
	void test4() {
		System.out.println("from test4()");
	}
}
class D  extends C implements A1,B1 {
	public void test1() {
		System.out.println("form test1()");
	}

	public void test2() {
		System.out.println("from test2()");
	}

	void test3() {
		System.out.println("form test3()");
	}

	public static void main(String[] args) {
		D obj = new D();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		System.out.println("done");
	}
}
