package iib;
class Parents{
	{
		System.out.println("Parents IIB");
	}
	
	public Parents() {
		System.out.println("Parents() - Constructor");
	}
}
public class L extends Parents {
	{
		System.out.println("FROM Chile (L) IIB");
	}
	
	public L() {
		System.out.println("l() - Constructor");
	}
	
	public static void main(String[] args) {
		new L();
	}
}
/*
 
 In Parents and child relationship first parents class IIB blocks are executed then chld 
 class IIB are executed.

output 

Parents IIB
Parents() - Constructor

FROM Chile (L) IIB
l() - Constructor

*/