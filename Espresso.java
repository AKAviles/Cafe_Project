package com.perscholas.cafe;

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
