package amit;

public class S
{
	static int test(int i)
	{
		return ++i;
	}
	public static void main(String[] args)
	{
		int i = 0;
		System.out.println(test(i++));
		System.out.println(i);
		i = 0;
		System.out.println(test(i--));
		System.out.println(i);
	}
}
//yeha par pahale 0 test me pass ho ga then after line no 13 i ka value 1 ho it is bec test(i++)
//then test method will return 1 bec return ++i this so line 12=1
//similar as...........