package lara;

public class F
{
	static int j;//declaration
	static
	{
		i = 50;
		//System.out.println("static:->"+i);
		//j=i;
	}
	static int i = 5;
	public static void main(String[] args)
	{
		System.out.println(i);
	}
}
/*
inside SIB we are not using the i value , it is not comes under perfect uses
of i (uses= we are not printing the i value)
that is why forward reference is legal inside the SIB
SIB is executing only once while class is loading

i=0,50,5



*/