package simple;
import java.util.*;
public class MultiplicationTable
{
	public static void main(String args[])
	   {
	      int n, c;
	      System.out.println("Enter the number");
	      Scanner in = new Scanner(System.in);
	      n = in.nextInt();
	      System.out.println("Multiplication table of "+n+" is :-");
	      for ( c = 1 ; c <= 10 ; c++ )
	      System.out.println(n + "*" + c + " = " +(n*c));
	   }
}
