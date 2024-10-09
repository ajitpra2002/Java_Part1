package primitiveautowidening;

public class Manager2
{
	public static void main(String[] args)
	{
		byte b = 10;
		System.out.println("byte="+ b);
		int i = b;
		System.out.println("int=" + i);
		long lon =i;
		System.out.println("lon="+ lon);
		float f1=lon;
		System.out.println("float=" + f1);
		double d = i;
		System.out.println("double="+ d);
		f1=b;
		d=lon;
		f1=i;
		System.out.println("done");
	}
}
