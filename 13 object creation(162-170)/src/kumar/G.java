package kumar;

class G
{
	int i;
	void test() {
		System.out.println("my name is ajit");
	}

	public static void main(String[] args)
	{

		 G g1 = new G();
		 System.out.println(g1.i);
		 g1.test();

	}
}
/*
 g1 is the derived data type g1 is called the referenced variable .
 all referenced variable can refer  object.
 whenever object is creating of any class on that point of time 
 all the non static member is loading in the memory.
 g1 data type is  G type
 and G is the class type
 
 
 we call the non static member through the reference variable.
 
 */