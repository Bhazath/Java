package org;

public class Employee 
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Emplyee Id of "+name+" is "+id;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Ambani");
		Employee e2 = new Employee(102, "Tata");
		Employee e3 = new Employee(103, "Cook");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}

	
}
