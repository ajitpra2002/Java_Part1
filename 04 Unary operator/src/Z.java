class Z
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=--i +--i + --i +i;
		 //    -1 + -2 + -3 + -3
		System.out.println(i);		
		System.out.println(j);		
	}
}
