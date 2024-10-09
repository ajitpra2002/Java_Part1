/*
-->Encapsulation is a mecanisms through which we can wrapping the data member and member method 
of class in a single unit .
->Declare the class veriable as private
->Declare the class method as public
Ex-:
	class is the best exampe of encapsulation
	
			 -------------                 {
			|      |      |                { 
			|      |      |=====>> CLASS   {==== capsul            
			|      |      |                {
			 -------------                 {
			 /           \
			/             \
		   /               \
		veriable         method
must be private           public
*/
class Encapsulation {
	private int value;//hinding
	public void setValue(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
class B {
	public static void main(String[] args) {
		Encapsulation r = new Encapsulation();
		// System.out.println(r.value);CTE because value is private
		r.setValue(400);
		System.out.println(r.getValue());
	}
}
//-->so here we are hiding the data (value)
// for example here setvalue is id of the user 
// if id is right then get value method will show as user account
