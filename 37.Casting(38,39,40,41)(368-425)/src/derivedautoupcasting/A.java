//391
package derivedautoupcasting;
 
  class A {
	  void add() //int
	{
	int a=20,b=30,c;
	c=a+b;
	System.out.println(c);
	//return c;
	}
	void add(int x,int y)
	{
	int c;
	c=x+y;
	System.out.println(c);
	}
	void add(int x,double y)
	{
	double c;
	c=x+y;
	System.out.println(c);
	}
	public static void main(String[] arg)
	{
	A a=new A();
	a.add();
	//int k=a.add();
	//System.out.println("add="k);
	a.add(100,200);
	a.add(100,200.45);
	}
}
 
 