package lara;

public class A
{
	static 
	{
		System.out.println("SIB");
	}
	public static void main(String[] args)
	{
		System.out.println("main");
	}
}


/*
static initialization block 
------------------------------
it is comes under one of the initializer.
every SIB  are executing before the main method
first SIB will be executing then main() will be executed
before main method SIB will be executing top to bottom
no matter where SIB is there in the class, after SIB main()
will be executing .
before executing main() all SIB will be executing  top to bottom
SIB is executing only once while class is loading






*/