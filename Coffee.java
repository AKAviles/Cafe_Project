package com.perscholas.cafe;

import java.util.Scanner;

public class Coffee extends Product {
	private boolean sugar;
	private boolean milk;

	public Coffee() {
		super();
		this.sugar = false;
		this.milk = false;
	}

	public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
		super(name, price, description);
		this.sugar = sugar;
		this.milk = milk;
	}

	@Override
	public double calculateProductTotal() {
		double subtotal = getQuantity() * getPrice();
		System.out.println("Cost for coffee is: " + subtotal);
		return subtotal;
	}

	@Override
	public void addOptions() {
	}

	@Override
	public void getInputFromUser(Scanner scanner) {
		System.out.println("How much " + getName() + " would you like?");
		int count = scanner.nextInt();
		setQuantity(count);
		System.out.println("Would you like to add sugar? Yes or No");
		scanner.nextLine();
		String decision = scanner.nextLine();
		editSugar(decision);
		System.out.println("Would you like to add milk? Yes or No");
		decision = scanner.nextLine();
		editMilk(decision);
		printOptions();
		calculateProductTotal();
	}

	@Override
	public void printOptions() {
		if (this.milk) {
			if (this.sugar) {
				System.out.println("Milk and sugar added to coffee");
			} else {
				System.out.println("Milk added to coffee");
			}
		} else if (this.sugar) {
			System.out.println("Sugar added to coffee");
		} else {
			System.out.println("No options added");
		}
	}

	private void editSugar(String decision) {
		String lowerCase = decision.toLowerCase();
		switch(lowerCase) {
			case "yes":
				setSugar(true);
				break;
			case "no":
				break;
		}
	}

	private void editMilk(String decision) {
		String lowerCase = decision.toLowerCase();
		switch(lowerCase) {
			case "yes":
				setMilk(true);
				break;
			case "no":
				break;
		}
	}

	public boolean isSugar() {
		return sugar;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}
}
