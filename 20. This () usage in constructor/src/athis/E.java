package lara.athis;

import lara.com.T1;

public class E {
	int i;

	E()
	{
		System.out.println("t()");
		i = 10;
	}

	E(int i)
	{
		this();
		System.out.println("f(int)");
	}

	public static void main(String[] args)
	{
		E e1 = new E();
		System.out.println("...........");
		E e2 = new E(20);
		System.out.println(e1.i + " ," + e2.i);
	}
}

/*
 3) this() : to invoke current class constructor
 The this() constructor call can be used to invoke the current class constructor. 
 It is used to reuse the constructor. 
 */