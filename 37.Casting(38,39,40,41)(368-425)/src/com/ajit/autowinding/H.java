package com.ajit.autowinding;

public class H
{
	static int test(short s)
	{
		return s;
		//return (int)s;
	}
	public static void main(String[] args)
	{
		byte b = 10;
		double d = test(b);
		//double d = (double)test((short)b);
		System.out.println(d);
	}
}

// s is Auto widening into int type