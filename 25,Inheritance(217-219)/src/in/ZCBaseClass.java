package in;

public class ZCBaseClass {
	void foo() {
		System.out.println("In ZCBaseClass.foo()");
	}

	void bar() {
		System.out.println("In ZCBaseClass.bar()");
	}

	public static void main(String[] args) {
		ZCBaseClass po = new DerivedClass1();
		po.foo();
		po.bar();
		//po.jar(); //method jar() is undefined for the type ZBaseClass
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		ZCBaseClass zcBaseClass = new ZD();
		zcBaseClass.foo();
		zcBaseClass.bar();
	   //zcBaseClass.jar();//method jar() is undefined for the type ZBaseClass
		
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		DerivedClass1 zd = new ZD();
		zd.foo();
		zd.bar();
		zd.jar();
		//able to call jar() is defined in DerivedClass1 class
		System.out.println("Main End");
	}

}

class DerivedClass1 extends ZCBaseClass {
	void foo() {
		System.out.println("In DerivedClass1.foo()");
	}

	void bar() {
		System.out.println("In DerivedClass1.bar()");
	}

	void jar() {
		System.out.println("in DerivedClass1.jar()");
	}
}

class ZD extends DerivedClass1 {
	@Override
	void bar() {
		System.out.println("ZD --bar()");
	}

	@Override
	void foo() {
		System.out.println("ZD --foo()");
	}

	@Override
	void jar() {
		System.out.println("ZD --jar()");
	}
}
