package com;

public class Car {
	
	static int cost = 10;

	public static void main(String[] args) {
		
		System.out.println(cost); // Car.cost
		
		Car.cost = 20; // Car.cost = 20;
		
		System.out.println(cost); // Car.cost
		
		System.out.println("-------------------");
		
		Car c1  = new Car();
		
		System.out.println(c1.cost); // not a good practice
	} 
}
