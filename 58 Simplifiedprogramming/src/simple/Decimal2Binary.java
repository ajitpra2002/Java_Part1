package simple;

import java.util.Scanner;

class Decimal2Binary
{
	public static void main(String[] args)
	{
		int n, i=0;
		System.out.println("enter the decimal number:");
		Scanner in  = new Scanner(System.in);
		n = in.nextInt();
		int bin[] = new int[n];
		while(n>0)
		{
			bin[i]=n%2;
			n=n/2;
			i++;
		}
		System.out.println("binary number is:");
		for (int j=i-1;j>=0 ;j--)
		{
			System.out.print(bin[j]);
		}
	}
}
