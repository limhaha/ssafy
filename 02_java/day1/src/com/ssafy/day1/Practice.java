package com.ssafy.day1;

import java.util.Random;

public class Practice {
	public static void main(String[] args) {
		int N=6;
		Random rand = new Random();
		int num1 = rand.nextInt(N) + 1;
		int num2 = rand.nextInt(N) + 1;
		String result = null;
		result = (num1+num2) %2 == 0 ? "A" : "B";
		
		System.out.printf("%d, %d --> %s%n", num1, num2, result);
	}
}
