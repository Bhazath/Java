package org;

public class Vehicle {

	Vehicle(String brand, int cost) {
		System.out.println("Brand: "+brand+"Cost: "+cost);
	}

	Vehicle(String brand){
		System.out.println("Brand: "+brand);
	}
	
	Vehicle() {
		System.out.println("No Argument Constructor");
	}

	Vehicle(String brand, String fuel){
		System.out.println("Brand: "+brand+"fuel: "+fuel);
	}

	Vehicle(int cost, String brand){
		System.out.println("Cost: "+cost+"Brand: "+brand);
	}

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle("BMW"); 
		Vehicle	v2 = new Vehicle("Audi", 45000);
		new Vehicle(8999, "Suzuki");
		new Vehicle("Honda", "Petrol");
		
		new Vehicle();
		Vehicle obj = new Vehicle();
		
	}

}
