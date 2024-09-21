package com;

public class Test {

	public static void main(String[] args) {
		
		Son s = new Son();
		Doughter d = new Doughter();
		Father f = new Father();
		
		System.out.println(s instanceof Son);	// True
		System.out.println(s instanceof Father);	// True
		
		System.out.println(d instanceof Doughter);	// True
		System.out.println(d instanceof Father);
		
		System.out.println(f instanceof Father);	// True
		System.out.println(f instanceof Son);	// False
		System.out.println(f instanceof Doughter);
		
		System.out.println("--------------");
		
		System.out.println(new Son() instanceof Father);	// True	
		System.out.println(new Father() instanceof Doughter);	// false
		System.out.println(new Doughter() instanceof Doughter);	// true
		
	}
}

/*
Father f = new Son();
Doughter d = (Doughter)f;

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Duplicate local variable f

	at com.Test.main(Test.java:9)
*/
