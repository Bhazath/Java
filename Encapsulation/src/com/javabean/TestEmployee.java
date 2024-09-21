package com.javabean;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		System.out.println(emp.getName()+" "+emp.getId());
		
		System.out.println("------------");
		
		emp.setName("Tom");
		emp.setId(101);
		
		System.out.println("Name: "+emp.getName());
		System.out.println("Id: "+emp.getId());
		
	}

}
