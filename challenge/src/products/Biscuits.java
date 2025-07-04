package products;

public class Biscuits extends Product implements Shippable{

	private final double weight;
	
	public Biscuits(double price, int quantity, boolean expirable, boolean shippable, double weight) {
		super(price, quantity, true, true, false);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return "Biscuits";
	}
	
}
