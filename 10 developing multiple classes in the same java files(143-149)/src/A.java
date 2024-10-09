
 public  class A
{
	static int i;
}

 class B
{
	public static void main(String[] args)
	{
		System.out.println(A.i);
		 //System.out.println(i);
	}
}
 

/*
we can develop any number of class in the same java file.
we can incorporate any no of  enum, class, interface, annotation.
if all classes are non public then we can choose any of the class 
or any name.
if we choose any name of the java file while compiling we have to 
take the main method class name .
if  one of them is public are then it is mandatory to save that file with public class.
if more then one class is public then compiler giver CTE.
for every member of the .java file , compiler generate the dot class file

we can call the static global variable of the one class  into another class we
have to call the along with the class name followed by dot then variable name.


*/