package lara.athis;

public class J {
	public J getObjJ() {
		return this;
	}
	public void print() {
		System.out.println("J class");
	}
}
/*
6) this keyword can be used to return current class instance

We can return this keyword as an statement from the method. 
In such case, return type of the method must be the class type (non-primitive).

syntax
return_type method_name(){  
	return this;  
}  
*/
