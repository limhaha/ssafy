package com.ssafy.day5.collection.asort;

import java.util.Arrays;
import java.util.Comparator;

public class ATest {
//	static Comparator comparator = new MyComparator();
//
//	static class MyComparator implements Comparator<Integer>(){
//
//		@Override
//		public int compare(Integer o1, Integer o2) {
//			return -(o1 - o2);
//		}
//	};

//	static Comparator comparator = new Comparator<Integer>() {
//
//		@Override
//		public int compare(Integer o1, Integer o2) {
//			// TODO Auto-generated method stub
//			return -(o1 - o2);
//		}
//	};
	
	public static void main(String[] args) {
		Integer[] arr = {3, 5, 8, 7, 5, 9, 2};
//		String[] srr = {"7", "100", "23"};
		
		System.out.println(Arrays.toString(arr));
		
		//오름차순으로 정렬하라 
		Arrays.sort(arr, (o1,o2) -> -(o1 - o2));
		System.out.println(Arrays.toString(arr));
		
		//내림차순으로 정렬하라 
		
	}

}
