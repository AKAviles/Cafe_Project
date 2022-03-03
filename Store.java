package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.List;

public class Store {
	private List<Product> storeItems = new ArrayList<>();

	public Store() {

	}

	public void addCoffee(String name, double price, String description, boolean sugar, boolean milk) {
		this.storeItems.add(new Coffee(name, price, description, sugar, milk));
	}

	public void addEspresso(String name, double price, String description, boolean sugar, boolean milk) {
		this.storeItems.add(new Espresso(name, price, description, sugar, milk));
	}

	public void addCappuccino(String name, double price, String description, boolean sugar, boolean milk) {
		this.storeItems.add(new Cappuccino(name, price, description, sugar, milk));
	}

	public List<Product> getStoreItems() {
		return storeItems;
	}
}
