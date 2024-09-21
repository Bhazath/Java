package com;

public class MainClass {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		s.m1();
		System.out.println("*****");
		
		s.m2("john", 25);
		System.out.println("*****");
		
		String company = s.m3();
		System.out.println(company);
		
		System.out.println(s.m3());
		System.out.println("*****");
		
		int sum = s.m4(4, 5);
		System.out.println(sum);
		
		System.out.println(s.m4(12, 78));
	}

}
