package amit.kumar;

public class J {
	static int i = 0;

	static void test1() {
		System.out.println("TEST1 :" + i);
		i = 1;
	}

	static void test2() {
		System.out.println("test2:" + i);
		i = 2;
	}

	public static void main(String[] args) {
		test1();
		System.out.println("main1:" + i);
		test2();
		System.out.println("main2:" + i);
	}
}
