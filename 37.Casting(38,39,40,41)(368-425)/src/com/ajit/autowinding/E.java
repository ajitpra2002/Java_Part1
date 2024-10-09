package com.ajit.autowinding;

public class E
{
	static void test(double d)
	{
		System.out.println("double d =" + d);
		System.out.println("test(duble)");
		
	}
	public static void main(String[] args)
	{
		int i = 100;
	//test(i);//before calling the test() method int i is auto widening into double 
		test(i);
		System.out.println("done");
		
	}
}
