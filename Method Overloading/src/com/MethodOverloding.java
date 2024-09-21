package com;

public class MethodOverloding {

	void display() {
		System.out.println("Hello Dabbafellow");
	}
	
	void display(int x) {
		System.out.println(x);
	}
	
	void display(double x) {
		System.out.println(x);
	}
	
	void display(int x, String y) {
		System.out.println(x+" "+y);
	}
	
	void display(String y, int x) {
		System.out.println(x+" "+y);
	}
}
