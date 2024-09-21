package com;

public class Employee extends Person {
	
	void work() {
		System.out.println("Working");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.work();
	}

}
