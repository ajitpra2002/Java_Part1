
public class DoubleTon
{
	private static DoubleTon[] tons = new DoubleTon[2];
	
	private static int index;
	
	private DoubleTon()
	{
		
	}
	
	static 
	{
		tons[0]= new DoubleTon();
		tons[1] = new DoubleTon();
	}
	
	public static DoubleTon getObject()
	{
		return tons[(index++) % 2];
	}
	
	public static void main(String[] args)
	{
		DoubleTon d1 = new DoubleTon().getObject();
		DoubleTon d2 = new DoubleTon().getObject();
		DoubleTon d3 = new DoubleTon().getObject();
		DoubleTon d4 = new DoubleTon().getObject();
		DoubleTon d5 = new DoubleTon().getObject();
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
	}
}
