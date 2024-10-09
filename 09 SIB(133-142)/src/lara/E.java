package lara;

public class E
{
		static int i = 1 ;
		static
		{
			System.out.println("1-i>"+i);
			i = 2;
			System.out.println("2-i>"+i);
			i=100;
			System.out.println("3-i>"+i);
		}
		public static void main(String[] args)
		{
			System.out.println("4-i>"+i);
			i=10;
			System.out.println(E.i);
		}
}
