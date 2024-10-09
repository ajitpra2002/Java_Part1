package InputOutput;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int a, i;
		System.out.println("please enter the number ::");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		for (i = 1; i <= 10; i++) {
			System.out.println(a + "*" + i + "=" + a * i);
		}
	}
}