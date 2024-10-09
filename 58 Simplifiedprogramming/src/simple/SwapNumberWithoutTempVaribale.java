package simple;
import java.util.*;

public class SwapNumberWithoutTempVaribale
{
	public static void main(String args[])
	   {
		//System.out.println("Before Swapping\n x = " + "\n y = ");
	      int x, y;
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	 
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	 
	      x = x + y;
	      y = x - y;
	      x = x - y;
	 
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	   }
}
