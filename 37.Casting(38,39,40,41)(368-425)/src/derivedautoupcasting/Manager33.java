package derivedautoupcasting;

class R1
{
	void test1()
	{
		System.out.println("R test1()");
	}
}

class S1 extends R1
{
	void test2()
	{
		System.out.println("S test2()");
	}
}
class Manager33
{
	public static void main(String[] args)
	{
		R1 r1 = new R1();
		r1.test1();
	//	r1.test2();
		
		S1 s1 = new S1();
		s1.test1();
		s1.test2();
		
		R1 r2 = new S1();
		r2.test1();
		//r2.test2();
		
		if(r2 instanceof S1)
		{
			S1 s2 = (S1)r2;
			s2.test1();
			s2.test2();
			
		}
		System.out.println("done");
	}
}
/*
 in order to access the every memeber of S object first we have to upcasted into R1 TYPE
 then r2 is downcasted into S type.
 
 */
