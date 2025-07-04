package products;

public class Cheese extends Product implements Shippable{

	
	private final double weight;
	
	public Cheese(double price, int quantity, boolean expirable, boolean shippable, double weight, boolean expired) {
		super(price, quantity, true, true, expired);
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}

	public String getName() {
		return "Cheese";
	}
}
