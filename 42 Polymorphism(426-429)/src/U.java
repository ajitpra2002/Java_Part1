class R {

	public static void main(String[] args) {
		System.out.println("R-main");
	}

	static {

		System.out.println("SIB-R");
	}

}

class S extends R {
	public static void main(String[] args) {

		System.out.println("S-main");
	}

	static {
		System.out.println("Sib-S");
	}
}

class T extends S {
	static {
		System.out.println("T-SIB");
	}
}

class U {
	public static void main(String[] args) {
		System.out.println("U-main-b");
		T.main(args); // s.main(args);
		System.out.println("U-main-e");
	}
}
