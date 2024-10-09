package simple;

import java.util.Scanner;

public class Binery2Decimal {
	public static void main(String[] args) {

		int bin = 0;// binary value
		int decimal = 0;// decimal value
		Scanner in = new Scanner(System.in); // Scanner object
		int p = 1; // the power of 2
		System.out.println("Enter Binary Number"); // getting binary number
		bin = in.nextInt();
		// the loop - checking and converting
		while (bin > 0) {
			int remenderDig = bin % 10;
			if (remenderDig != 0 && remenderDig != 1) {
				System.out.println("Number is not Binary");
				System.exit(0);
			}
			// converting
			else {
				decimal = decimal + remenderDig * p;
				p = p * 2;
				bin = bin / 10;
			}
		}
		// printing decimal value
		System.out.println("Decimal Value is: " + decimal);

	}

}
