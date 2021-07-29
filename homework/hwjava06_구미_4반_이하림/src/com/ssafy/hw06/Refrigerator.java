package com.ssafy.hw06;

public class Refrigerator extends Product{
	private int vol;

	public Refrigerator(String serialNum, String name, int price, int stock, int vol) {
		super(serialNum, name, price, stock);
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
		return super.toString() + "용량 : " + vol + "]";
	}

	
	
	
}
