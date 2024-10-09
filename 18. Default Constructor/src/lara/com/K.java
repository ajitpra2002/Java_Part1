package lara.com;

public class K
{
	K(int i) {
		System.out.println("k(int)");
		System.out.println(i);
	}

	K(boolean b) {
		System.out.println("k(boolean)");
		System.out.println(b);
	}

	public static void main(String[] args) {
		K k1 = new K(90);
		System.out.println("...........");
		K k2 = new K(true);
		System.out.println("............");
	}

}
