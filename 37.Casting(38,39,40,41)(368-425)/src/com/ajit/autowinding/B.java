package com.ajit.autowinding;

public class B
{
	public static void main(String[] args)
	{
		byte b = 10;
		//int i = b;
		 int i = (int)b;
		System.out.println("int i = " + i);
		System.out.println("done");
		//bsc in lfd
	}
}
