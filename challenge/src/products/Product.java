package products;

public abstract class Product {
	private double price;
	private int quantity;
	private final boolean expirable;
	private final boolean shippable;
	private boolean expired;
	
	public Product(double price, int quantity, boolean expirable, boolean shippable, boolean expired) {
		this.price = price;
		this.quantity = quantity;
		this.expirable = expirable;
		this.shippable = shippable;
		this.expired = expired;
	}

	public boolean isShippable() {
		return shippable;
	}

	public abstract String getName();

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isExpirable() {
		return expirable;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	
	
}
