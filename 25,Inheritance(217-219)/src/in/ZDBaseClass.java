package in;

public class ZDBaseClass {
	private void foo() {
		System.out.println("In ZDBaseClass.foo()");
	}

	void bar() {
		System.out.println("In ZDBaseClass.bar()");
	}

	public static void main(String[] args) {
		ZDBaseClass po = new DerivedClas();
        po.foo();
        po.bar();
		System.out.println("Done");
	}
}

class DerivedClas extends ZDBaseClass {
    void foo() {
        System.out.println("In DerivedClas.foo()");
    }

    void bar() {
        System.out.println("In DerivedClas.bar()");
    }
}
