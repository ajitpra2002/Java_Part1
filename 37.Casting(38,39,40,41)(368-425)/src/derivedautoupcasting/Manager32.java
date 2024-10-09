package derivedautoupcasting;

class P1 {
	int i = 10;
}

class Q1 extends P1 {
	int j = 20;
}

class Manager32 {
	public static void main(String[] args) {
		P1 p1 = new P1();
		System.out.println(p1.i);// CTS

		Q1 q1 = new Q1();
		System.out.println(q1.i);// CTS
		System.out.println(q1.j);// CTS

		P1 p2 = new Q1();
		//System.out.println(p2.j);
		System.out.println(p2.i);

		if (p2 instanceof Q1) {
			Q1 q2 = (Q1) p2;// why required downcasting
			System.out.println(q2.i);
			System.out.println(q2.j);
		}
	}
}

/*
 * by using P reference we can only access i. bu using Q reference we can obly
 * access i and j both
 * 
 * 
 * 
 */