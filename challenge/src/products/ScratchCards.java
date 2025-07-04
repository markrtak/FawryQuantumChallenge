package products;

public class ScratchCards extends Product{

	
	public ScratchCards(double price, int quantity, boolean expirable, boolean shippable) {
		super(price, quantity, false, false, false);
	}

	@Override
	public String getName() {
		return "Scratch Card";
	}

}
