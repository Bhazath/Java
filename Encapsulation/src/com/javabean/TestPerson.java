package com.javabean;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setAge(25);
		
		int age = p.getAge();
		System.out.println("Age: "+age);
		
		System.out.println(p.getAge());
	}
}

/*System.out.println(p.age);
p.age = 20;*/