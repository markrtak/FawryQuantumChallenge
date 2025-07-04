package customer;

import java.util.ArrayList;

import exceptions.*;
import products.Product;
import products.Shippable;

public class Customer {
	private ArrayList<Item> items;
	private double balance;
	
	
    public Customer(double balance) {
        items = new ArrayList<Item>();
        this.balance = balance;
    }
    
    public void addToCart(Product p, int q) throws Exception {
    	if(q>p.getQuantity()) {
    		throw new OutOfStockException();
    	}
    	if(p.isExpired() == true) {
    		throw new ExpiredException();
    	}
    	Item i = new Item(p,q);
    	items.add(i);
    }
    
    public void checkout() throws Exception {
    	if(items.isEmpty()) throw new EmptyCartException();
    	double subtotal = getSubtotal();
    	double shipmentFee = getTotalWeight();
    	if((subtotal + shipmentFee) > balance) throw new InsufficientBalanceException();
    	printCheckout();
    }
    
    
    public double getSubtotal() {
    	double subtotal = 0;
    	for(int i = 0; i < items.size(); i++) {
    		subtotal += items.get(i).getProd().getPrice() * items.get(i).getQuantity();
    	}
    	return subtotal;
    }
    
    public double getTotalWeight() {
    	double totalWeight = 0;
    	for(int i = 0; i < items.size(); i++) {
    		if(items.get(i).getProd() instanceof Shippable) {
    			Shippable s = (Shippable) items.get(i).getProd();
    			totalWeight += s.getWeight() * items.get(i).getQuantity();
    		}
    	}
    	return totalWeight;
    }
    
    public void printCheckout() {
    	ShippingService.processShipping(items);
    	System.out.println("\n** Checkout Receipt **");
        for (int i = 0; i<items.size(); i++) {
        	if(items.get(i).getProd() instanceof Shippable) {
        		 Product s = items.get(i).getProd();
        		 System.out.println(items.get(i).getQuantity() + "x " + s.getName() + " " + items.get(i).getQuantity() * s.getPrice());
        	}
        }
        System.out.println("-----------");
        System.out.println("Subtotal: " + getSubtotal());
        System.out.println("Shipping: " + getTotalWeight()*0.03);
        System.out.println("Amount: " + (getSubtotal() + getTotalWeight()*0.03));
    }
    
}
