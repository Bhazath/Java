package org;

public class Demo {
	
	public static void main(String[] args) {
	
		System.out.println("start");
		try
		{
		System.out.println(10/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("end");
	
	}
}
/*
	Exception in thread "main" java.lang.ArithmeticException: / by zero
	at org.Demo.main(Demo.java:7)
*/