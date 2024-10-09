package kumar;

class K
{
	int i;
	static
	{
		K k1 = new K();
		System.out.println("value of i is :" + k1.i);
	}

	public static void main(String[] args)
	{
		System.out.println("done");
		//System.out.println(k1.i);
	}
}
