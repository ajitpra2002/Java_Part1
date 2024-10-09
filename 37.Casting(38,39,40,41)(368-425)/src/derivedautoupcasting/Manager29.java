//423
package derivedautoupcasting;
class Manager29
{
	public static void main(String[] args) 
	{
		A a1=new C();  
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
		System.out.println(a1 instanceof D);
		//System.out.println(a1 instanceof String);
		
	}
}
/*
while using instanceof we have to use under one hierachy class , 
ohterwise it will produce CTE

COMPILE is checking a1 is type of A TYPE BUT UNDER A hierachy there is no
strign , so it will give CTE


*/