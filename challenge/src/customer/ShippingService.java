package customer;

import java.util.ArrayList;

import products.*;
import products.Shippable;

public class ShippingService {
	
	
    public static void processShipping(ArrayList<Item> items) {
        System.out.println("\n** Shipment Notice **");
        for (int i = 0; i<items.size(); i++) {
        	if(items.get(i).getProd() instanceof Shippable) {
        		 Shippable s = (Shippable) items.get(i).getProd();
        		 System.out.println(items.get(i).getQuantity() + "x " + s.getName() + " " + items.get(i).getQuantity() * s.getWeight());
        	}
        }
        System.out.println("Total package weight: " + getTotalWeight(items));
    }
    
    public static double getTotalWeight(ArrayList<Item> items) {
    	double totalWeight = 0;
    	for(int i = 0; i < items.size(); i++) {
    		if(items.get(i).getProd() instanceof Shippable) {
    			Shippable s = (Shippable) items.get(i).getProd();
    			totalWeight += s.getWeight() * items.get(i).getQuantity();
    		}
    	}
    	return totalWeight;
    }
    
}