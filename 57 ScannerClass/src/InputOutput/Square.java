package InputOutput;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		int a;
		System.out.println("please enter the number::");
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		int square=a*a;
		System.out.println("your square of the number is:::" + square);
		}

}
