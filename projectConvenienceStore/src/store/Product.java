/**
 * 
 */
package store;

public class Product {
	public String name;
	public double price;
	
	// constructor 
	public Product(String name, double price){
		this.name = name;
		this.price = price;
	}
	// method for calculation after discount 
	public double calculationFinalValue() {
		 return price;
	}
	
	public String toString() {
		return "Product " + name + " Price " + price;
	}
	
}
