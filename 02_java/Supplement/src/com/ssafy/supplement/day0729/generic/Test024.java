/**
	Generic Method 활용
 */
package com.ssafy.supplement.day0729.generic;

import java.util.Arrays;
import java.util.List;

public class Test024 {

	public static <T extends Comparable<T>> T max1(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) max = y;
		if (z.compareTo(max) > 0) max = z;
		return max;
	}
	
	public static <T extends Comparable<T>> T max2(List<T> list) {
		T max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).compareTo(max) > 0) max = list.get(i);
		}
		return max;
	}
	
	public static <T extends Comparable<T>> T max3(List<T> list) {
		return list.stream().max((t1, t2) -> t1.compareTo(t2)).get();
	}
	
	public static void main(String[] args) {
		System.out.println(Test024.<Integer>max1(3, 4, 5));
		System.out.println(max1(6.6, 8.8, 7.7));
		System.out.println(max1("a", "e", "c"));
		
		System.out.println(max2(Arrays.asList(3, 4, 5)));
		System.out.println(max2(Arrays.asList(6.6, 8.8, 7.7)));
		System.out.println(Test024.<String>max2(Arrays.asList("a", "e", "c")));
		
		System.out.println(Test024.<Integer>max3(Arrays.asList(3, 4, 5)));
		System.out.println(max3(Arrays.asList(6.6, 8.8, 7.7)));
		System.out.println(max3(Arrays.asList("a", "e", "c")));
	}
}