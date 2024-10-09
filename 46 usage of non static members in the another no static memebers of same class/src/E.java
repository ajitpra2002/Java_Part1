
class E
{
	int i;
	void test()
	{
		System.out.println(i);//this.i
	}
	public static void main(String[] args)
	{
		E e = new E();
		e.test();
	}
}
