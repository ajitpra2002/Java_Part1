package amit.kumar;

public class U
{    
	 //static int i =j;//Cannot reference a field before it is defined
	static int j = 10;

	// java does not support the illegal forward reference
	 //static int j =10;
	public static void main(String[] args)
	{
		// System.out.println(i);
		System.out.println(j);
	}
}
/*
 * first of all we have to declare the s g v or we can initialize with some
 * value then we initialize their reference to any another s g v , otherwise
 * compiler will give the cte due to illegal forward reference i.e static int j
 * =i; static int i = 10; we can not do like this because before declaration we
 * can not initialize the value of i to j; it will give the compile time error
 * 
 */