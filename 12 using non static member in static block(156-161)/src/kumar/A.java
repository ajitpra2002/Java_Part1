package kumar;

public class A
{
	static int i;  
	  int j;
	public static void main(String[] args)
	{
		System.out.println(i);
	}
}
/*if we write only int i; and compile then it gives the error message bz non
static variable i can not be referenced from static context;
//when we create class all static member loaded in the memory but non 
static member are not loaded in the memory
 when we
//create the object of that class.
//static block executed only ones for each class load.

*/