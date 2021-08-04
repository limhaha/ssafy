/**
 * Generic Method 이해
 */
package com.ssafy.supplement.day0729.generic;

public class Test021 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3 };
		Double[] arr2 = { 1.1, 2.2, 3.3 };
		Character[] arr3 = { '안', '녕' };

		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
	}

	public static void printArray(Integer[] arr) {
		for (Integer element : arr)
			System.out.printf("%s ", element);

		System.out.println();
	}

	public static void printArray(Double[] arr) {
		for (Double element : arr)
			System.out.printf("%s ", element);

		System.out.println();
	}

	public static void printArray(Character[] arr) {
		for (Character element : arr)
			System.out.printf("%s ", element);

		System.out.println();
	}
}