package products;

public class Tv extends Product implements Shippable{
	
	private final double weight;
	
	public Tv(double price, int quantity, boolean expirable, boolean shippable, double weight) {
		super(price, quantity, false, true, false);
		this.weight = weight;
	}

	@Override
	public String getName() {
		return "TV";
	}

	@Override
	public double getWeight() {
		return weight;
	}

}
