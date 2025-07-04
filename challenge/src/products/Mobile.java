package products;

public class Mobile extends Product implements Shippable{

	private final double weight;
	
	public Mobile(double price, int quantity, boolean expirable, boolean shippable, double weight) {
		super(price, quantity, false, true, false);
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}

	public String getName() {
		return "Mobile";
	}
}
