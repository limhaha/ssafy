package com.ssafy.java;

class TV extends Product {
	private int inch;
	private String display;

	public TV(int productNum, String name, int price, int stock, int inch, String display) {
		super(productNum, name, price, stock);
		this.inch = inch;
		this.display = display;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	@Override
	public String toString() {
		return "TV [inch=" + inch + ", display=" + display + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
