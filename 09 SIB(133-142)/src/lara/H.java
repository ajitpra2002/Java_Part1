package lara;

public class H
{
	static int i ;
	static int j = 100;
	static
	{
		i=j;
	}
	//static int j = 100;// illegal forward reference;
	public static void main(String[] args)
	{
		System.out.println("done");
		System.out.println(i);
		System.out.println(j);
	}

}

/*
I=0,100
J=100

*/