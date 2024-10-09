package amit.kumar;

class F {
	int i;

	F(int k) {
		i = k;
		System.out.println("f()");
	}

	public static void main(String[] args) {
		F f1 = new F(1);
		System.out.println(f1.i);
	}
}
