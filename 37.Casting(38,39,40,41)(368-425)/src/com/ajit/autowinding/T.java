package com.ajit.autowinding;

public class T
{
	public static void main(String[] args)
	{
		double d1 = 10.9;
		float f1 = (float)d1;
		int i = (int)f1;
		byte b = (byte)i;
		System.out.println("done");
	}
}
