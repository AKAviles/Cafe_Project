package com.perscholas.cafe;

import java.util.Scanner;

public class Espresso extends Product{
	private boolean extraShot;
	private boolean macchiato;

	public Espresso() {
		super();
		this.extraShot = false;
		this.macchiato = false;
	}

	public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}

	@Override
	public double calculateProductTotal() {
		double extras = calculateExtras();
		double subtotal = extras + (getQuantity() * getPrice());
		System.out.println("Subtotal is: " + subtotal);
		return subtotal;
	}

	private double calculateExtras() {
		double extraCost = 0.00;
		if (extraShot) {
			extraCost += 2.00;
		}
		if (macchiato) {
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
		System.out.println("Would you like to add extra shot? Yes or No");
		scanner.nextLine();
		String decision = scanner.nextLine();
		editShot(decision);
		System.out.println("Would you like to make it Macchiato? Yes or No");
		decision = scanner.nextLine();
		editMacchiato(decision);
		printOptions();
		calculateProductTotal();
	}

	@Override
	public void printOptions() {
		if (this.isExtraShot()) {
			if (this.macchiato) {
				System.out.println("Double shot Macchiato");
			} else {
				System.out.println("Double shot espresso");
			}
		} else if (this.macchiato) {
			System.out.println("Made it Macchiato");
		} else {
			System.out.println("No options added");
		}
	}
	private void editShot(String decision) {
		String lowerCase = decision.toLowerCase();
		switch(lowerCase) {
			case "yes":
				setExtraShot(true);
				break;
			case "no":
				break;
		}
	}

	private void editMacchiato(String decision) {
		String lowerCase = decision.toLowerCase();
		switch(lowerCase) {
			case "yes":
				setMacchiato(true);
				break;
			case "no":
				break;
		}
	}

	public boolean isExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public boolean isMacchiato() {
		return macchiato;
	}

	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}
}
