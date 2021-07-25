package com.ssafy.java;

public class ProductTest {
	public static void main(String[] args) {

		Product tv = new TV(1111, "I'm TV", 2000000, 100, 75, "4k");
		Product ref = new Refrigerator(2222, "I'm refrigerator", 1500000, 50, 900);


		System.out.println(tv);
		System.out.println(ref);
	}
}
