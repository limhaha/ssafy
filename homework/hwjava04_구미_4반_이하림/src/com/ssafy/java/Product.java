package com.ssafy.java;

public class Product {
	int productNum;
	String name;
	int price;
	int stock;

	public Product(int productNum, String name, int price, int stock) {
		super();
		this.productNum = productNum;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [productNum=" + productNum + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}

}
