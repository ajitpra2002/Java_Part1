//224
package in;
class V
{
	V(int i)
	{
		System.out.println("v(int)");
	}
}
class W extends V
{
	W(int i)
	{
		super(2);
		System.out.println("W(int)");
	}
	public static void main(String[] args)
	{
		V v1 = new V(90);
		System.out.println(".....");
		W w1 = new W(90);
		System.out.println("......");
	}
}
