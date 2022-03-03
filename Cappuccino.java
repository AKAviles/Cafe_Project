package com.perscholas.cafe;

import java.util.Scanner;

public class Cappuccino extends Product{
	private boolean peppermint;
	private boolean whippedCream;

	public Cappuccino() {
		super();
		this.peppermint = false;
		this.whippedCream = false;
	}

	public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}

	@Override
	public double calculateProductTotal() {
		double extras = calculateExtras();
		double subtotal = extras + (getQuantity() * getPrice());
		System.out.println("Subtotal is: " + subtotal);
		return subtotal;
	}

	public double calculateExtras() {
		double extraCost = 0.00;
		if (peppermint) {
			extraCost += 2.00;
		}
		if (whippedCream) {
			extraCost += 1.00;
		}
		return extraCost;
	}

	@Override
	public void addOptions() {

	}

	@Override
	public void getInputFromUser(Scanner scanner) {
		System.out.println("How much " + getName() + " would you like?");
		int count = scanner.nextInt();
		setQuantity(count);
		System.out.println("Would you like to add peppermint? Yes or No");
		scanner.nextLine();
		String decision = scanner.nextLine();
		editPeppermint(decision);
		System.out.println("Would you like to add whipped cream? Yes or No");
		decision = scanner.nextLine();
		editWhip(decision);
		printOptions();
		calculateProductTotal();
	}

	@Override
	public void printOptions() {
		if (this.whippedCream) {
			if (this.peppermint) {
				System.out.println("Peppermint and Whipped cream added to cappuccino");
			} else {
				System.out.println("Whipped cream added to coffee");
			}
		} else if (this.peppermint) {
			System.out.println("Peppermint added to coffee");
		} else {
			System.out.println("No options added");
		}
	}

	private void editWhip(String decision) {
		String lowerCase = decision.toLowerCase();
		switch(lowerCase) {
			case "yes":
				setWhippedCream(true);
				break;
			case "no":
				break;
		}
	}

	private void editPeppermint(String decision) {
		String lowerCase = decision.toLowerCase();
		switch(lowerCase) {
			case "yes":
				setPeppermint(true);
				break;
			case "no":
				break;
		}
	}

	public boolean isPeppermint() {
		return peppermint;
	}

	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public boolean isWhippedCream() {
		return whippedCream;
	}

	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}
}
