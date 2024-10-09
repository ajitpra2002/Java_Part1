package first.part;
class A 
{
	public static void main(String[] args) 
	{
		final int i=10;
		 int j=20;
		System.out.println(i);
		System.out.println(j);
		//i=15;//we are trying to reinitialize the final variable i 
		// compiler give the cte
		j=1;
		System.out.println(i);
		System.out.println(j);
	}
}
