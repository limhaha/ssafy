package com.ssafy.io;

public class R01_FactorialTest {

	
	private static int factorial0(int n) {
		int res = 1;
		for(int i=n; i>0; --i) {
			res *= i;
		}
		return res;
	}
	
	
	private static int factorial(int n) {
		if(n<=1) return 1;
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial0(5));
	}

}
