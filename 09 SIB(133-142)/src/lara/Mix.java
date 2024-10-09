package lara;

class Mix {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		{
			int y = 5;
			System.out.println("y=" + y);
			System.out.println("x=" + i);
		}
		System.out.println("outside block");
		  //System.out.println(y);
	}

}
