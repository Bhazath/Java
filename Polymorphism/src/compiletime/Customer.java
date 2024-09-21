package compiletime;

public class Customer {

	public static void main(String[] args) {
		Myntra m = new Myntra();
		
		m.purchase(101);
		
		m.purchase(1000, "Mobile");
		
		m.purchase("Laptop");
		
		m.purchase("Shoe",5000);
	}
}
