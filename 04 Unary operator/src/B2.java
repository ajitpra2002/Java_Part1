class B2
{
	public static void main(String[] args) 
	{
		int i=1;
		int j=i++;//first it assign the value of i into the j;
			 //i++;
			// i=i+1;
			// i=1+1=2  after calculating the value of in the rhs the value is assign to i			
		System.out.println(i);
		System.out.println(j);
		System.out.println(i++);
		System.out.println(i);
		
	}
}

/*
	i value is assigning to J - that is we are using it
	So first it will assign the older value of i to J then it will crease the value of i by 1;

*/