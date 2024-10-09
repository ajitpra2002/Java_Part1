package first.part;

class Q {
	final int i = 10;

	void test() {
		// i=10; // non static final variable trying to re-initialize in non
		// -static test() method.
	}
}
