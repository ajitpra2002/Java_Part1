package com.ajit.autowinding;

public class K
{
	public static void main(String[] args)
	{
		int i = 10;
		double j =  i;
		// double j = (double)i;//(double)is optional//
		System.out.println("double d = " + j);
		System.out.println("done");
	}
}
