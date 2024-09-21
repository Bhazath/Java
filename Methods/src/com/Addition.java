package com;

class Addition 
{
	/* Method with Arguments and without return statement */
	void add(int a, int b)
	{
		System.out.println("Sum of "+a+" & "+b+" is "+(a+b) );
		/*int sum = a+b;
		System.out.println("Sum of "+a+" & "+b+" is "+sum);*/
		//System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Addition obj = new Addition();
		
		obj.add(10, 20);
		obj.add(6, 3);
		obj.add(123, 456);
		
	}
}
