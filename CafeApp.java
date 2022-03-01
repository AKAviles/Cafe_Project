package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		//use scanner to get client input for quantity for the items instantiated
		// Make arraylist of objects to iterate through for calculateSubTotal.
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product("coffee", 2.00, "Black Coffee"));
		products.add(new Product("espresso", 3.50, "Double shot espresso"));
		products.add(new Product("cappuccino", 4.60, "Creamy espresso boi"));

		Scanner scan = new Scanner(System.in);
		for (Product product: products) {
			System.out.println("How much of " + product.getName() + " would you like?" );
			int count = scan.nextInt();
			product.setQuantity(count);
			product.calculateProductTotal();
		}
		scan.close();



	}
}
