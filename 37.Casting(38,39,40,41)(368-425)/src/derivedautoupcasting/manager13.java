
//407
package derivedautoupcasting;
class Manager13 
{
	public static void main(String[] args) 
	{
		A a1=new B();//autoupcasting
		
		//B b1=a1;  // CTE
		//B b1 =(B)a1;//explicit downcasted  (B)a1;
		System.out.println("done");
	}
}
