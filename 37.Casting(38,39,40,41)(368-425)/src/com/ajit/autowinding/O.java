package com.ajit.autowinding;

public class O
{
	static int test1()
	{
		byte b = 10;
		//return b;
		return (int)b;
	}
	static int test2()
	{
		byte b = 10;
		return(int)b;
	}
	public static void main(String[] args)
	{
		double d1 = test1();
		//double d1 = (double)test1();
		double d2 = (double)test2();
		System.out.println("done");
	}
}
