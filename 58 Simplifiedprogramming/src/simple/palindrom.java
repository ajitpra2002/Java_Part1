package simple;

import java.util.Scanner;

public class palindrom
{

	public static void main(String[] args)
	{
		int n,sum=0,rev,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n= sc.nextInt();
		temp = n;
		 
		   while( temp != 0 )
		   {
		      rev = temp%10;
		      sum = sum *10 +rev;
		      temp=temp/10;
		   }
		 
		   if ( n==sum )
		   {
		   
		   	System.out.println("given number is equal to its reverse :");
		   }
		   else 
			{
					if(n>sum)
		   			{
		   				System.out.println("given number is greater of its reverse:");
		   			}
		   			else
		  			{
		   				System.out.println("given number is smaller of its reverse:");
		  			}
			}
		

	}
}
