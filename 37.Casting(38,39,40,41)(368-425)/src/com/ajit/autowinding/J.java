package com.ajit.autowinding;

public class J
{
	static short test1(byte b)
	{
		return b;
		//return (short)b;
	}
	static float test2(byte b)
	{
		return test1(b);
		//return (float)test1(b);
	}
	public static void main(String[] args)
	{
		byte b =10;
		double d = test2(b);
		//double d = (double)test2(b);
		System.out.println("double d = " + d);
		System.out.println("done");
	}
}


