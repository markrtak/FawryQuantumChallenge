package customer;

import products.Product;

public class Item {
	private Product prod;
	private int quantity;
	
	public Item(Product prod, int quantity) {
		this.prod = prod;
		this.quantity = quantity;
	}
	
	public double getTotalPrice() {
		return prod.getPrice() * quantity;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
