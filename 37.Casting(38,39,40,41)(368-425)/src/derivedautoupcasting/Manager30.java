//424
package derivedautoupcasting;
class Manager30
{
	
	
	
	
	public static void main(String[] args) 
	{
		A a1=new C();
		//A a1=(A)(B)(C)new D();  
		if(a1 instanceof A)
		{
		System.out.println("to A");
			A a2=(A)a1;
		}
		
		
		if(a1 instanceof B)
		{
			 
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println("to B");
			B b1=(B)a1;
		}
		
		if(a1 instanceof C)
		{
			System.out.println("to C");
			C c1=(C)a1;
		}
		if(a1 instanceof D)
		{
			System.out.println("to D");
			D d1=(D)a1;
		}
		
	}
}

/*
a1 instanceof D, since a1 is not the instace of D so it will
return false so control will not come under if block 

*/