package com.ssafy.day06;

public class Test {
	public static void main(String[] args) {

		Test b = new Test();

		if (b instanceof Object) {
			System.out.println("형변환가능");
		}

//		int[] su = { 34, 55, 27, 67, 45, 82, 68, 99, 77, 18 };
//		int sum = 0;
//		float min = 100;
//		int result = 0;
//		for (int i = 0; i < su.length; i++) {
//			sum += su[i];
//		}
//		int avg = sum / 10;
//
//		for (int i = 0; i < su.length; i++) {
//			if ((avg - su[i]) >= 0) { // 두수의 차가 양수일때
//				float num = avg - su[i];
//				if (min > num) {
//					min = num;
//					result = su[i]; // 현재 배열값을 result에 넣어준다
//				}
//			}
//			if ((avg - su[i] < 0)) { // 두수의 차가 음수일때
//				float num = -(float) (avg - su[i]); // 부호 바꿈
//				if (min > num) {
//					min = num;
//					result = su[i]; // 현재 배열값을 result에 넣어준다
//				}
//			}
//		}
//
//		System.out.println(avg + " " + result);
//	}
	}
}
