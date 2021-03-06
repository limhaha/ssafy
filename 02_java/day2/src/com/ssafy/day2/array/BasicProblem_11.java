package com.ssafy.day2.array;

/**
 * @since 2021. 7. 5.
 */
public class BasicProblem_11 {
    public static void main(String[] args) {
        int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};
        // TODO: 문제 10을 Integer와 Math class를 이용하여 re-factoring 해보세요.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int num : intArray) {
        	min = Math.min(min, num);
        	max = Math.max(max, num);
        }
        // END:
        System.out.printf("min: %d, max: %d%n", min, max);

    }
}
