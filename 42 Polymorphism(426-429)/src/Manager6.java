class L {
	static int i;
	static {
		System.out.println("SIB-L");
	}
}

class M extends L {
	static {
		System.out.println("SIB-M");
	}
}

class Manager6 {
	public static void main(String[] args) {

		System.out.println("------");
		System.out.println(M.i);// L.i
		System.out.println("------");
	}
}
