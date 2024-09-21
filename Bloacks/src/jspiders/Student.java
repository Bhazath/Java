package jspiders;

public class Student 
{
	static int age;
	
	static
	{
		age = 10; // Student .age = 10;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Age: "+Student.age); // age
	}
	
	static
	{
		age = 20; // Student .age = 20;
	}
}

//age = 0 -> 10 -> 20
