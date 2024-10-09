//101
package amit.kumar;

public class A {
	static int i;// default value is zero;

	public static void main(String[] args) {
	 
		System.out.println(i);
		i = 100;
		System.out.println(i);
		i = 200;
		System.out.println(i);
	}
}

/*
static variable are the global variable it does not required to initialized 
static variable having the default value according to their data type 
g v can be reinitialized again and again

g v can be used any of the method throughout the current class.
local variable get more preference then  gv 
g v does not required  to initialize explicitly before usages
g v can be modified anywhere within the current class

*/