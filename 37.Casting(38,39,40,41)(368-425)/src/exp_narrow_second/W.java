package exp_narrow_second;

class W
{
	public static void main(String[] args)
	{
		double d1=10.9090;
		int i = (int)d1;
		System.out.println(i);
		short s = (short)i;
		System.out.println("s="+ s);
		byte b = (byte)s;
		System.out.println("b="+b);
		int i1 = (byte)(short)(int)d1;
		System.out.println("i1=" + i1);
		System.out.println("done");
	}
}
