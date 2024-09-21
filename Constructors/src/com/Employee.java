package com;

public class Employee {

	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display()	{
		
		System.out.println("Employee Id: "+this.id);
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee Salary: "+salary);  // this.salary
		
	}
	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Dinga", 1200.34);
		Employee e2 = new Employee(201, "Guldu", 700.00);
		
		System.out.println("Employee Details");
		System.out.println("=====================");
		
		e1.display();
		System.out.println("----------*-------------");
		e2.display();
	}
}
