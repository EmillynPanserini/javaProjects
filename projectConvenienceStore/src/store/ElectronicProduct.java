package store;

//subclass
public class ElectronicProduct extends Product{

	public ElectronicProduct(String name, double price) {
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
