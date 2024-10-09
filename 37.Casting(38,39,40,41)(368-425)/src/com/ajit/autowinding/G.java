package com.ajit.autowinding;

public class G
{
	static int test(byte b)
	{
		//return (int)b;
		return b; 
		//b is auto converted into the interger type 
	}
	public static void main(String[] args)
	{
		byte b = 10;
		System.out.println(test(b));
	}
}
