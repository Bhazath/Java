package com;

public class Bike 
{
	// Parameterized Custom Constructor
	Bike(int cost)
	{
		System.out.println("Cost: "+cost);
	}
	
	public static void main(String[] args) 
	{
		Bike b = new Bike(1000);
			
	}
}
