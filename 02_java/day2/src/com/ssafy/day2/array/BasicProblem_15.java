package com.ssafy.day2.array;

import java.util.Arrays;

/**
 * @since 2021. 7. 6.
 */
public class BasicProblem_15 {
    public static void main(String[] args) {
        // TODO: 문제에서 제시하는 2차원 배열을 생성하고 내용을 출력하시오.
    	char[][] chars = {
    			{'C', 'A', 'A'}, {'C', 'C', 'B'}, {'B', 'A', 'B'}, {'C', 'C', 'C'}
    			};
    	
    	for(char[] carray : chars) {
    		for(char c : carray) {
    			System.out.print(c);
    		}
    		System.out.println();
    	}
    	
    	System.out.println(Arrays.deepToString(chars));
        // END:
    }
}
