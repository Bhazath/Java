package com;

class Car 
{
	// Non-Parameterized Custom Constructor
	Car()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("start");
		
		Car c = new Car();
		
		System.out.println("end");
	}
}
