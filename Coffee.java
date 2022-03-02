package com.perscholas.cafe;

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
