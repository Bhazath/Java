package com;

class Son extends Father
{
	@Override
	void bike()
	{
		System.out.println("New Modified Son's Bike");
	}
	
	public static void main(String[] args) 
	{
		Son s = new Son();
		s.bike();
	}
}
