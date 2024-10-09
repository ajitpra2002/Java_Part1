public class A1
{
	public static void main(String[] args) 
	{
		int i=0;
		System.out.println("line 6 ->>>" + (++i));
		System.out.println("line 7--->"+ i);
		
	}
}
/*
	i++ is the post increment first it uses the previous value then it 
	increase the value then it uses itself
	Printing the i values at line number 6 -  that is we are using the i value.
	So first it will use the older value - it will print the older values
	then it will increment the i values
*/
 