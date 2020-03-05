package edu.oracle.inventory;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList();

		products.add(new Product());
		products.add(new Product());
		products.add(new Product("0001", "Margarina", 567L, 3500.0));
		products.add(new Product("0002", "Chocolate", 324L, 4500.0));
		products.add(new Product("0003", "Aceite", 2354L, 4600.0));
		products.add(new Product("0004", "Arroz", 235L, 5700.0));
		products.add(new Product("0005", "Leche", 2235L, 5700.0));
		products.add(new Product("0006", "Huevos", 2355L, 5400.0));		

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 1; i++) {
			Product p = new Product();
			System.out.println("Ingrese la información del producto " + (i + 1));

			System.out.print("SKU: ");
			p.setSku(sc.nextLine());

			System.out.print("Name: ");
			p.setName(sc.nextLine());

			System.out.print("Units: ");
			p.setNumberUnits(sc.nextLong());

			System.out.print("Price: ");
			p.setUnitPrice(sc.nextDouble());

			products.add(p);

		}
		
		products.stream().forEach(p -> System.out.println(p.toString()));

	}

}
