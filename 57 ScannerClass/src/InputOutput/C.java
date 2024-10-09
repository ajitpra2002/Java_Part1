package InputOutput;

/*
 * //find the table of any number package InputOutput;
 * 
 * import java.util.Scanner;
 * 
 * public class C { public static void main(String[] args) {
 * 
 * System.out.println("please enter the any number :::"); Scanner obj=new
 * Scanner(System.in); int i=obj.nextInt(); for(int j=1;j<=10;j++) {
 * System.out.println(i+"*"+j "=" + i*j);
 * 
 * 
 * }num+" * "+i+" = "+num*i
 * 
 * }
 * 
 * }
 */
import java.util.Scanner;  
public class C 
{  
public static void main(String args[])   
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter number: ");       
int num=sc.nextInt();  
for(int i=1; i <= 10; i++)  
{  
System.out.println(num+" * "+i+" = "+num*i);  
}  
}  
}  