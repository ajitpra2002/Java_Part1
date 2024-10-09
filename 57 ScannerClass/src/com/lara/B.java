package com.lara;

import java.util.Scanner;

public class B
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name=");
		String name = sc.next();
		
		
		System.out.println("Enter your age=");
		int  age = sc.nextInt();
		
		
		System.out.println("Enter your weigh=");
		double weight = sc.nextDouble();
		
		
		System.out.println("Are you married?(yes/no)=");
		boolean flag = sc.nextBoolean();
		
		
		System.out.println("you have entered:");
		System.out.println("name="+name);
		System.out.println("age=" + age);
		System.out.println("weight=" + weight);
		System.out.println("married status" + flag);
	}
}
