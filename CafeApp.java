package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		//use scanner to get client input for quantity for the items instantiated
		// Make arraylist of objects to iterate through for calculateSubTotal.

		Coffee coffee = new Coffee("Coffee", 2.00, "Black", false, false);
		Espresso espresso = new Espresso("espresso", 3.50, "Espresso shot", false, false);
		Cappuccino cappuccino = new Cappuccino("cappuccino", 4.60, "Creamy espresso boi", false, false);

		Scanner scanner = new Scanner(System.in);
		coffee.getInputFromUser(scanner);
		espresso.getInputFromUser(scanner);
		cappuccino.getInputFromUser(scanner);
		calculateCartTotal(coffee, espresso, cappuccino);
		scanner.close();




	}

	private static double calculateCartTotal(Coffee coffee, Espresso espresso, Cappuccino cappuccino) {
		double coffeeCost = coffee.calculateProductTotal();
		double espressoCost = espresso.calculateProductTotal();
		double cappuccinoCost = cappuccino.calculateProductTotal();
		double cartSubtotal = coffeeCost + espressoCost + cappuccinoCost;
		double salesTax = cartSubtotal * 0.06;
		double finalCost = cartSubtotal + salesTax;
		System.out.println("Subtotal: " + cartSubtotal
				+ "\nTax: " + String.format("%.2f", salesTax)
				+ "\nTotal: " + String.format("%.2f", finalCost));
		return finalCost;
	}
}
