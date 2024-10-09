package InputOutput;

import java.util.Scanner;

public class Circumfrence {
	public static void main(String[] args) {
		System.out.println("please enter the radius of the circle ::");
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		double p=(2*3.1428*k);
		System.out.println("circumference of the circle is==>>"+p);
	}
}
