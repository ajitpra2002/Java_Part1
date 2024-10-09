package lara;

public class G
{
	static int i ;
	static
	{
		
		System.out.println(i); //illegal forward reference
	}
	//static int i ; this is cte  illegal forward reference
	public static void main(String[] args)
	{
		System.out.println("done");
	}

}

/*
CTE because inside the SIB  we are using the i value for printing purpose that is
uses of i is not proper, when the uses of any variable is proper, that variable should 
be declaration before
in this example
first we are using i value for printing purpose.
second declaration
so compiler gives CTE

*/