package first.part;

class N {
	final int i = 10;
	N n1 = new N();
	
	public static void main(String[] args) {
		N n3 = new N();
		int j=20;
		System.out.println("done");
	}
 
  public N() 
	{
		System.out.println("Contructor -N()");
	}
}

/*
VVI
When we program execution starts, control enters to the main method, and finds N n3 = new N(). 
	It creates object of N and while creating object it has to instantiate all its instance variables 
		which includes N n1 = new N(), so it again creates a new N object and loads all instance variables in 
			that and there also it finds same N n1 = new N(), so it again creates the N object and 
				this will continue until the stack is overflowed.

This can be solved just by changing N n1 = new N(); to N n=null;

*/