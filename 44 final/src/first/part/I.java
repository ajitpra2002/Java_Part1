package first.part;
class I
{
	public static void main(String[] args) 
	{
		
		final int[]x= new int[3];
		System.out.println(x);
		x[1]=10;
		x[1]=100;
		//x=y;
		//x=null;//can not reassign a value to final variable x;
		System.out.println("done");
		
	}
}
