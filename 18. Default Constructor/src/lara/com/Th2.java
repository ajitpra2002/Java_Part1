package lara.com;

public class Th2 {
	Th2() {
		System.out.println("DEFOULT CONSTRUCTOR WIHTOUT PARAMETER");
	}

	Th2(int i) {
		this();
		System.out.println("TH2");
	}

	public static void main(String[] args) {
		Th2 th = new Th2(2);
		Th2 th1 = new Th2();
	}
}
