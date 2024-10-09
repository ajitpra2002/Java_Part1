//403
package derivedautoupcasting;

public class Manager09
{
	static Object test1()
	{
		D d1 = new D();
		//return d1;
		return (Object)d1;//d1 is upcasted into Object type.
	}
	public static void main(String[] args)
	{
		Object obj = test1();
		System.out.println("done");
	}
}
//test1() return type is Object type before returning d1 it should be upcasted into Object type