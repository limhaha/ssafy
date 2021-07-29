package com.ssafy.hw06;

public class Product {
	private String serialNum;
	private String name;
	private int price;
	private int stock;
	
	Product() {};
	
	public Product(String serialNum, String name, int price, int stock) {
		super();
		this.serialNum = serialNum;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "[제품번호 : " + serialNum + ", 제품 이름 : " + name + ", 가격 : " + price + ", 재고수량 : " + stock;
	}
	
	
}
