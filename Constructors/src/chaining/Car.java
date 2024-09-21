package chaining;

public class Car {

	Car(String brand)
	{
		// this(500);
	}
	
	Car(int cost)
	{
		// this("BMW");
	}
	
	public static void main(String[] args) 
	{
		Car c = new Car("BMW");
	}
}
