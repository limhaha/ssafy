/**
    Generic Method 이해
		- 인스턴스 메서드와 클래스 메서드 사용 가능
		- 형식
		  <타입파라미터> 반환타입 메서드명(..)
 */
package com.ssafy.supplement.day0729.generic;

public class Test022 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3 };
		Double[] arr2 = { 1.1, 2.2, 3.3 };
		Character[] arr3 = { '안', '녕' };

		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
	}

	public static <T> void printArray(T[] arr) {
		for (T element : arr)
			System.out.printf("%s ", element);

		System.out.println();
	}
}