package InputOutput;

//to find the area of circle
 import java.util.Scanner;
 class B{
     public static void main(String[] args)
     {
         System.out.println("please enter the radius of the circle:::");
                  Scanner a=new Scanner(System.in);
         int n= a.nextInt();
          double result=3.14*n*n;
         System.out.println("area of the circle is -:"+result);        }
    
 }