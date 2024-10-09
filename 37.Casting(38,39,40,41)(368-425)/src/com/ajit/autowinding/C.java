package com.ajit.autowinding;

public class C
{
	public static void main(String[] args)
	{
		short i = 20;
		double d = i;
		//double d = (double)i;
		System.out.println("double d = "+ d);
		System.out.println("done");
	}
}
