package com;

/* Accessing static properties within the same class */

public class Student 
{
	static int age = 20;
	
	static void study()
	{
		System.out.println("Student is Studying");
	}
	 
	public static void main(String[] args) 
	{
		System.out.println("start");
		
		System.out.println(Student.age);
		Student.study();
		
		System.out.println("-----------------");
		
		System.out.println(age); // ClassName.variableName -> ClassName.age -> Student.age
		study(); // ClassName.methodName() -> ClassName.study() -> Student.study()
		
		System.out.println("end");
	}
}
