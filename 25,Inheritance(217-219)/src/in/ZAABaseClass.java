package in;

public class ZAABaseClass {
	void foo() {
		System.out.println("In ZAABaseClass.foo()");
	}

	void bar() {
		System.out.println("In ZAABaseClass.bar()");
	}

	public static void main(String[] args) {
		ZAABaseClass baseClass = new ZAABaseClass();
		baseClass.foo();
		baseClass.bar();
		System.out.println("Main End");
	}
}
