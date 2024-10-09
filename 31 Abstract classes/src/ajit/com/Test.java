package ajit.com;
abstract class animal
{
	
/*	animal()
	{
		System.out.println("All animals");
	}
*/
	abstract void sound();
	 
	
}
class Dog extends animal{		
/*Dog()
	{
	super();
	}
*/
	void sound() {
		System.out.println("Dogs breaks");
	}
}
class lion extends animal{
		void sound()
		{
			System.out.println("lion is roar");
		}
		
	}
public class Test{	
	public static void main(String[] args) {
		Dog d=new Dog() ;
		lion l=new lion();
		d.sound();
		l.sound();
		
	}
}