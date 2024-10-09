package ajit;

class A{
	int a;//instance veriabale
	A(int a)//local veriable
	{
	this.a=a;
	}
	void test()
	{
	System.out.println(a);
	}
	public static void main(String[] args){
	 A r=new A(100);
	 r.test();
	}
}