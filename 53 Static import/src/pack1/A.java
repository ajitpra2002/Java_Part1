package pack1;

public class A
{
	public static int i = 20;
	public static void test()
	{
		System.out.println("test method from A class");
	}
}
/*
class A is public we can use outside pack1 also.
inside class A we are keeping the two member that is public so
we can use outside pack1 also


Java Static Import

The static import feature of Java 5 facilitate the java programmer to access 
	any static member of a class directly. There is no need to qualify it by the class name.
	
Advantage of static import:
   Less coding is required if you have access any static member of a class oftenly.

Disadvantage of static import:
    If you overuse the static import feature, 
    it makes the program unreadable and unmaintainable
*/