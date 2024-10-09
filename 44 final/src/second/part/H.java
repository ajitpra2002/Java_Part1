package second.part;

class H {
	final int i;
	H() 
	{
		i = 10;
	}

	H(double j)
	{
		i = 20;
	}

	public static void main(String args[]) {
		H h1 = new H();
		//h1.i=50;
		H h2 = new H(90.90);
		System.out.println(h1.i);
		System.out.println(h2.i);

	}
}
