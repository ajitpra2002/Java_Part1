package InputOutput;
/*
 Input
 * Scanner
 *->Scanner is a class .
 *Scanner class is the predefined in java which is available in  java.util package.
 --> it is used to get user input.
 rule.1> if you use scanner class it must create the object of scanner class.
   Scanner name=new Scanner(System.in);
Rule 2.> Scanner class method
1.> nextLine();   ->to get input as string
2.>nextInt();     ->to get input as integer type
3.> nextFloat();  ->to get input as float 
4.>nextBoolean(); ->to get input as true or false
5.>nextDouble();  ->to get input as double type
all are the method of scanner so with the help of object of the that class we can assecs it.
 Rule 3.> import scanner class package top the program.
 syntax->
 import java.util.Scanner ;
 Rule 4.>
 if user write wrong input the compiler gives (inputmismatch Exception)
  */
/*
output
     (System.out.println()) it is an output stetment in java through
	 * which we can print the variable ,Exprestion and many more content.
	 * System->pre defined class in java.lang package out
     ( out ),( int  ) is a static member in system class
*/
import java.util.Scanner;
public class InputOutput {
	public static void main(String[] args) {
		int a;
	    System.out.print("please enter data");
	    Scanner obj=new Scanner(System.in);
	    a=obj.nextInt();
	    System.out.println("output as a is->" + a);
	}

}















