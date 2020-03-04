package edu.oracle.inventory;

import java.util.ArrayList;

public class ProductTester {
	
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList();
		
		products.add(new Product());
		products.add(new Product());
		
		for (Product product : products) {
			System.out.println(product);
		}
		
	}
	
}
