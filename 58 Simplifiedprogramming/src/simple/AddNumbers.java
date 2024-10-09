package simple;

import java.util.Scanner;

public class AddNumbers {
	public static void main(String args[]) {
		int x, y, z;
		System.out.println("Enter two integers ");
		Scanner a = new Scanner(System.in);
		x = a.nextInt();
		y = a.nextInt();
		z = x + y;
		System.out.println("Sum of entered integers = " + z);
	}
}
