package store;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product(null, 0);
		System.out.println(p1);
		
		Product p2 = new ElectronicProduct("phone", 233);
		System.out.println(p2);
		
		Product p3 = new FoodProduct("Apple", 2);
		System.out.println(p3);
	}

}
