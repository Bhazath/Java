package com;

class Example 
{
	/* Method with Arguments and with return statement */
	int findSquare(int n)
	{
		return n*n;
	}
	
	public static void main(String[] args) {
		
		Example e = new Example();
		
		int res = e.findSquare(5 );
		System.out.println(res);
		
		System.out.println(e.findSquare(4));
	}
}
