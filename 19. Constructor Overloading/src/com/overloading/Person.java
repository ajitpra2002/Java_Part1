package com.overloading;

public class Person {
	Person(String name) {
		System.out.println("Name of person = " + name);
	}

	Person(String name, String voterId) {
		System.out.println("Name of person = " + name);
		System.out.println("Voter ID of " + name + " = " + voterId);
	}

	public static void main(String[] args) {
		// If user has not voter ID then just print name.
		Person person1 = new Person("Ravi");
		// If user has voter ID then print name and voter Id
		Person person2 = new Person("Ram", "12345678");
	}
}
/*
How many ways to overload Constructors?

There are three ways to overload the constructor and let’s see the constructor overloading program in java.
1. You can overload by changing the number of arguments/parameters.
2. You can overload by changing the data type of arguments.
3. The order of the parameters of methods.




 By changing the number of arguments : above programs belongs to this.
 https://javagoal.com/constructor-overloading-program-in-java/
*/
