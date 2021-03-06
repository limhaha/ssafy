package com.ssafy.day2.method;

public class OverloadingTest {

	static int doSum(int... arr) {
		int result = 0;
		System.out.println(arr.length);
		for(int data : arr) {
			result += data;
		}
		return result;
	}
	
//	static int doSum(int a, int b) {
//		int result = 0;
//		result = a + b;
//		return result;
//	}
//
//	static int doSum(int a, int b, int c) {
//		int result = 0;
//		result = a + b + c;
//		return result;
//	}
//
//	static int doSum(int a, int b, int c, int d) {
//		int result = 0;
//		result = a + b + c + d;
//		return result;
//	}
//	
//	static int doSum(int a, int b, int c, int d, int e) {
//		int result = 0;
//		result = a + b + c + d + e;
//		return result;
//	}

	public static void main(String[] args) {
		// 두수를 전달받아 그 합을 구하는 메소드를 만들어라
		// 세수를 전달받아 드 합을 구하는 메소드를 만들어라

		int result = doSum(3, 4);
		result = doSum(3, 4, 5);
		result = doSum(3, 4, 5, 6);
		result = doSum(3, 4, 5, 6, 7);
		
//		int result = doSumTwo(3, 4);
//		result = doSumThree(3, 4, 5);
//		result = doSumFour(3, 4, 5, 6);
//		result = doSumFive(3, 4, 5, 6, 7);
		System.out.println(result);
		
	}

}
