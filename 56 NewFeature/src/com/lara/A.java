

package com.lara;

import java.util.Scanner;

public class A
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the case string:");
		String s2 = sc.next();
		switch (s2)
		{
			case "xyz":
			{
				System.out.println("case xyz");
				break;
			}
			
			case "abc":
			{
				System.out.println("case abc");
				break;
			}
			case "pqr":
			{
				System.out.println("case pqr");
				break;
			}
			default:
			{
				System.out.println("not available try others");
			}
		}
		System.out.println("done");
	}
}

/*
 before jdk1.7 switch case statement we can only pass the character and integer 
 but now jdk1.7 we are also eligible for pass the string literal to the 
 switch case statement.
 
 */
