package simple;
import java.util.*;

class Fibbonacciseries
{
	public static void main(String[] args)
	{
		int i,first=0,second=1,next,n;
		System.out.println("enter the number of terms you wand:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for ( i = 0; i <=n; i++)
		{
			if(i<=1)
				next = i;
			else
			{
				next = first + second;
				first = second;
				second = next;
			}
			System.out.print("\n" + next);
		}
	}
}
