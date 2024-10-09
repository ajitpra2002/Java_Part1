package amit;

public class X
{
	static int test(int i)
	{
		return i++;
	}
	public static void main(String[] args)
	{
		int i = 0;
		System.out.println(test(i++));
		int j = i++ + i + test(i++) +  ++i + test(i++) + i
				+ --i + test(--i) + i + i + test(i--) + ++i ; 
		System.out.println(i);
		System.out.println(j);
	}
}
//j=1,2,2,4,4,5,4,3,3,3,3,3