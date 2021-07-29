package com.ssafy.hw06;

public class TV extends Product{
	private int inches;
	private String displayType;
	
	public TV(String serialNum, String name, int price, int stock, int inches, String displayType) {
		super(serialNum, name, price, stock);
				
		this.inches = inches;
		this.displayType = displayType;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	@Override
	public String toString() {
		return super.toString() + "인치 : " + inches + ", 디스플레이 타입 : " + displayType + "]";
	}

	
	
	
	
	
}
