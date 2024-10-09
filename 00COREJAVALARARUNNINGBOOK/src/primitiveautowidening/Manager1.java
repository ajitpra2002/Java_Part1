package primitiveautowidening;

public class Manager1
{
	public static void main(String[] args)
	{
		int i = 10;
		double d=i;
		//double d = (double)i;
		//compiler keeps like this
		System.out.println(d);
		System.out.println("done");
	}
}
