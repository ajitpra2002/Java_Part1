package com.overloading;

public class Employee {
	int id;
	String name;
	int Empid;

	// Empty constructor
	public Employee() {
		this.id = 0;
		this.name = "Not Available";
	}

	// Overloaded constructor with int parameter
	public Employee(int id) {
		this.id = id;
		this.name = "Not Available";

	}

	// Overloaded constructor with a int parameter and a string
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("Employee Info: ");

		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("**************************");
	}
	
	public static void main(String[] args) {
		// Call empty constructor
		Employee e1 = new Employee();
		e1.display();

		// Call one parameter constructor
		Employee e2 = new Employee(123);
		e2.display();

		// Call two parameter constructor
		Employee e3 = new Employee(123, "John");
		e3.display();

	}

}
