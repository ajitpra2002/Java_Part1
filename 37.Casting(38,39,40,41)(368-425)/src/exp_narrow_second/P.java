package exp_narrow_second;

class P
{
 public static void main(String[] args)
{
	double d1 = 10.9;
	//int i =d1;
	int i = (int)d1;
	System.out.println(i);
	System.out.println("done");
}
}
//whenever wider to narrower chances to loose data 
//that is why compiler will don not doing this thing automatically
//we have to do this thing exlicitily