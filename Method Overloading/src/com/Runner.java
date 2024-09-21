package com;

public class Runner {
	public static void main(String[] args) {
		
		MethodOverloding mol = new MethodOverloding();
		
		mol.display(45);
		mol.display(12, "java");
		mol.display(45.65);
		mol.display();
		mol.display("eclipse", 789);
	}

}
