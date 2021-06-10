package com.java8_001.lam02.lamdba;

public class Product {
	private int id;
	private String name;
	private String category;
	private int qty;
	private double pricePerKg;
	private double totalValue;

	public Product() {

	}

	public Product(int id, String name, String category, int qty, double pricePerKg) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.qty = qty;
		this.pricePerKg = pricePerKg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

}
