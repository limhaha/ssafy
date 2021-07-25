package com.ssafy.java;

public class Refrigerator extends Product {
	private int vol;

	public Refrigerator(int productNum, String name, int price, int stock, int vol) {
		super(productNum, name, price, stock);
		this.vol = vol;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "Refrigerator [vol=" + vol + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
