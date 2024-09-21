package chaining;

public class Employee {

	Employee(int id) { // id = 101
		System.out.println(id);
	}
	
	Employee(int id, String name) {
		this(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		new Employee(101, "Dinga");
	}
}
