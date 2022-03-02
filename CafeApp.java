package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		//use scanner to get client input for quantity for the items instantiated
		// Make arraylist of objects to iterate through for calculateSubTotal.
//		ArrayList<Product> products = new ArrayList<Product>();
//		products.add(new Coffee("Coffee", 2.00, "Black", false, false));
//		products.add(new Espresso("espresso", 3.50, "Espresso shot", false, false));
//		products.add(new Cappucino("cappuccino", 4.60, "Creamy espresso boi", false, false));


		Coffee coffee = new Coffee("Coffee", 2.00, "Black", false, false);
		Espresso espresso = new Espresso("Espresso", 3.50, "spresso", false, false);
		Cappuccino cappuccino = new Cappuccino("Cappuccino", 4.23, "cappy", false, false);

		Scanner scan = new Scanner(System.in);
		System.out.println("How much of " + coffee.getName() + " would you like?");
		int countCoffee = scan.nextInt();
		coffee.setQuantity(countCoffee);
		System.out.println("Would you like to add sugar? Yes or No");
		scan.nextLine();
		String decision = scan.nextLine();
		switch(decision) {
			case "Yes":
				coffee.setSugar(true);
				break;
			case "No":
				break;
		}
		System.out.println("Would you like to add milk? Yes or No");
		scan.nextLine();
		decision = scan.nextLine();
		switch(decision) {
			case "Yes":
				coffee.setMilk(true);
				break;
			case "No":
				break;
		}
		coffee.calculateProductTotal();

		System.out.println("How much of " + espresso.getName() + " would you like?");
		int countEspresso = scan.nextInt();
		espresso.setQuantity(countEspresso);
		System.out.println("Would you like to add an extra shot? Yes or No");
		scan.nextLine();
		decision = scan.nextLine();
		switch(decision) {
			case "Yes":
				espresso.setExtraShot(true);
				break;
			case "No":
				break;
		}
		System.out.println("Would you like to make it a macchiato? Yes or No");
		decision = scan.nextLine();
		switch(decision) {
			case "Yes":
				espresso.setMacchiato(true);
				break;
			case "No":
				break;
		}
		espresso.calculateProductTotal();

		System.out.println("How much of " + cappuccino.getName() + " would you like?");
		int countCap = scan.nextInt();
		cappuccino.setQuantity(countCap);
		System.out.println("Would you like to add peppermint? Yes or No");
		scan.nextLine();
		decision = scan.nextLine();
		switch(decision) {
			case "Yes":
				cappuccino.setPeppermint(true);
				break;
			case "No":
				break;
		}
		System.out.println("Would you like to add whipped cream? Yes or No");
		scan.nextLine();
		switch(decision) {
			case "Yes":
				cappuccino.setWhippedCream(true);
				break;
			case "No":
				break;
		}
		cappuccino.calculateProductTotal();
		calculateCartTotal(coffee, espresso, cappuccino);
		scan.close();








		// trying iterating through
//		for (Product product: products) {
//			System.out.println("How much of " + product.getName() + " would you like?" );
//			int count = scan.nextInt();
//			if (product.getName().equals("coffee")) {
//				System.out.println("Would you like to add sugar? Yes or No");
//				String decision =  scan.nextLine();
//				switch(decision) {
//					case "Yes":
//						product.set
//				}
//			}
//			product.setQuantity(count);
//			product.calculateProductTotal();
//		}
//		scan.close();



	}

	public static double calculateCartTotal(Coffee coffee, Espresso espresso, Cappuccino cappuccino) {
		double coffeeSub = coffee.calculateProductTotal();
		double espressoSub = espresso.calculateProductTotal();
		double cappuccinoSub = cappuccino.calculateProductTotal();
		double cartSubtotal = coffeeSub + espressoSub + cappuccinoSub;
		double salesTax = cartSubtotal * 0.06;
		double finalCost = cartSubtotal + salesTax;
		System.out.println("Subtotal: " + cartSubtotal
				+ "\nTax: " + salesTax
				+ "\nTotal: " + finalCost);
		return finalCost;
	}
}
