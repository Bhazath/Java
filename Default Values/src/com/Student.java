package com;

class Student {
	
	String name;
	int marks;
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.name+" "+s1.marks);
		System.out.println(s2.name+" "+s2.marks);
		
		System.out.println("-------------------");
		
		s1.name = "Tom";
		s1.marks = 36;
		 
		s2.name = "Jerry";
		s2.marks = 40;
		
		System.out.println(s1.name+" "+s1.marks);
		System.out.println(s2.name+" "+s2.marks);
		
		System.out.println("--------------------");
		
		System.out.println(s1.name+" has scored  "+s1.marks+" marks in java");
		System.out.println(s2.name+" has scored  "+s2.marks+" marks in java");
	}

}
