package com.ajit.autowinding;

public class I
{
	static float test1(int i)
	{
		return test2(i);
		//return (float)test2(i);
	}
	static long test2(int i)
	{
		return i;
		//return (long)i;
	}
	public static void main(String[] args)
	{
		byte b  =10;
		double d = test1(b);
		//double d = (double)test1((int)b);
		System.out.println("double d = " + d);
		System.out.println("done");
		
	}
}
