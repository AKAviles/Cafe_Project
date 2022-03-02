package com.perscholas.cafe;

public abstract class Product {
	private String name;
	private double price;
	private String description;
	private int quantity;

	public Product() {
	}

	public Product(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	//use array as input
	abstract public double calculateProductTotal();
//		double subtotal = this.quantity * this.price;
//		double salesTax = subtotal * 0.06;
//		double total = subtotal + salesTax;
//		System.out.println("Subtotal is: " + subtotal
//					+ "\nSales Tax: " + salesTax
//					+ "\nTotal is: " + String.format("%.2f", total));

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		//scanner input will determine this
		this.quantity = quantity;
	}

	public String toString() {
		return this.name + ", " + this.price + ", " + this.description;
	}
}
