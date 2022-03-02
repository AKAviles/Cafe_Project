package com.perscholas.cafe;

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
