package customer;

import products.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Cheese cheese = new Cheese(100, 4, true, true, 200,false);
		Biscuits biscuits = new Biscuits(150, 5, false, true, 700);
		
		Customer ahmed = new Customer(2000);
		ahmed.addToCart(biscuits, 1);
		ahmed.addToCart(cheese, 2);
		
		ahmed.checkout();
		
	}
}
