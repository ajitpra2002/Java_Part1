package InputOutput;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
	int l,b,h;
	System.out.println("please enter the length of the cube::");
	Scanner s1=new Scanner(System.in);
	l=s1.nextInt();
	System.out.println("please enter the bredth of the cube::");
	b=s1.nextInt();
	System.out.println("please enter the height of the cube::");
	h=s1.nextInt();
	int cube=l*b*h;
	System.out.println("cube ->"+ cube);
	}

}
