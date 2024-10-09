package exp_narrow_second;

class T
{
	public static void main(String[] args)
	{
		double d1= 10.9;
		System.out.println("d1="+d1);
		float f1 = (float)d1;
		System.out.println("f1="+ f1);
		int i = (int)f1;
		System.out.println("i="+ i);
		byte b  = (byte)i;
		System.out.println("b="+b);
		System.out.println("done");
	}
}

