package rst;

import lara.A;

public class P extends A {

	public P()
	{
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		P p = new P();
		System.out.println("Protected can be used in subclass of other package!!!");
		System.out.println(p.j);
	}
}
