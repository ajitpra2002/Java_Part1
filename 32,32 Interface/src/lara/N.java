package lara;

interface N {
	void test1();
}

class O implements N {
	public void test1() {
		System.out.println("from test1");
	}

	public static void main(String[] args) {
		//N n1 = new N();
		N n1 = new O();
		//interface/abstract clss can hold the reference of its child class.
		
		
		N n2 = null;
		System.out.println(n2);
		O o1 = new O();
		o1.test1();
		System.out.println("done");
	}
}
