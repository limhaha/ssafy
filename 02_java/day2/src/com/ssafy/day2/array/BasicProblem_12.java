package com.ssafy.day2.array;

import java.util.Arrays;

/**
 * @since 2021. 7. 6.
 */
public class BasicProblem_12 {
	public static void main(String[] args) {
		int[] intArray = { 3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3 };
		int[] used = new int[10];

		for (int a : intArray) {
			used[a]++;
		}
		System.out.println(Arrays.toString(used));

//        int[] used = new int[10];
//        // TODO: intArray에 사용된 요소가 각각 몇개씩인지 used에 저장하시오.
//        for(int num : intArray) {
//        	used[num]++;
//        }
//        // END:
//        System.out.println(Arrays.toString(used));
//    }
	}
}
