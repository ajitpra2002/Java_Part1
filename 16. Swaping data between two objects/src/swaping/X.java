package swaping;

public class X
{
	int i;
	static void test(X obj1 , X obj2)
	{		//			x1	,	x2
		int i = obj1.i;
	//	int i = x1.i;
		obj1.i = obj2.i;
	//	x1.i	=x2.i;	
		obj2.i = i;
	//	x2.i	=	x1.i;
	}
	public static void main(String[] args)
	{
		X x1 = new X(), x2 = new X();
		
		x1.i = 10;
		x2.i = 20;
		System.out.println("VALUE OF X1.I IS :" + x1.i);
		System.out.println("VALUE OF X2.I IS :" + x2.i);
		System.out.println("------------------------"); 
		test(x1,x2);//HERE WE ARE PASSING THE OBJECT TO THE TEST METHOD
		System.out.println("VALUE OF X1.I IS :" + x1.i);
		System.out.println("VALUE OF X2.I IS :" + x2.i);
		
	}
}
