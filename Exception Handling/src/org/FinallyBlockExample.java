package org;

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		try {
			System.out.println(10/0);
		}
		catch(ClassCastException a)
		{
			System.out.println("Invalid");
		}
		finally {
			System.out.println("Inside Finally Block");
		}
		
		System.out.println("end");
	}
}
