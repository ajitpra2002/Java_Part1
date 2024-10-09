package in;

class Animals {

}

class Dog extends Animals {

}

public class ZA {
	public static void main(String[] args) {
		ZA za = new ZA();
		Animals animals = new Animals();
		Dog dog = new Dog();
		Object object =  new Object();
		
		System.out.println(dog instanceof Animals);
		System.out.println(animals instanceof Object);
		System.out.println(animals instanceof Dog);
		System.out.println("-----------------");
		System.out.println(za instanceof Object);
		System.out.println(object instanceof Animals);
		//System.out.println(za instanceof Animals);
		// CTE : inconvertible types;
		
	}
}




