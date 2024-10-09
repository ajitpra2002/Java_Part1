package first.part;

import java.util.Arrays;

class H
{
	public static void main(String[] args) 
	{
		
		final int[]x= new int[2];
		//new int[2]-we are creating two integer object .
		x[0]=10;
		x[1]=20;
		x[0]=500;
		x[1]=200;
		//int [] y = new int[2];
		//x=y;
		System.out.println(Arrays.toString(x));
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}
