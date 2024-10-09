package lara;

public class N
{
 static boolean test()
 {
	 System.out.println("test begin");
	 if(10==10)
	 return true;
	 System.out.println("test end");
	 return false;
 }
 public static void main(String[] args)
{
	boolean b=test();
	System.out.println(b);
	System.out.println("hello world");
	}
}
