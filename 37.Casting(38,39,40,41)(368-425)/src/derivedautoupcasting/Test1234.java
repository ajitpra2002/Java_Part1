package derivedautoupcasting;

class  Test1234{  
	   void PrintData() {  
	      System.out.println("method of parent class");  
	   }  
	}  
	  
	class Child1 extends Test1234 {  
	   void PrintData() {  
	      System.out.println("method of child class");  
	   }  
	}  
	class UpcastingExample1{  
	   public static void main(String args[]) {  
	      
		   Test1234 obj1 =   new Child1();  
		   Test1234 obj2 =  new Child1();   
	      obj1.PrintData();  
	      obj2.PrintData();  
	       
	   }  
	} 
