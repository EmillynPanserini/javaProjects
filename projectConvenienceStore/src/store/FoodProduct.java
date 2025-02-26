package store;

public class FoodProduct extends Product{

	public FoodProduct(String name, double price) {
		super(name, price);
	}
	
	@Override
	public double calculationFinalValue() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Product " + name + " Price " + price;
	}
}
