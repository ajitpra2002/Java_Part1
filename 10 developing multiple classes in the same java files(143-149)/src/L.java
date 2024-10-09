class L {
	int i;
	static {
		System.out.println("sib-L");

	}

	public static void main(String[] args) {
		System.out.println("L-main");
	}
}

class M {
	static {
		System.out.println("sib-m");
	}

	public static void main(String[] args) {
		System.out.println("M-main- BEGIN");
		L.main(args);
		System.out.println("M-MAIN-END");
	}
}
