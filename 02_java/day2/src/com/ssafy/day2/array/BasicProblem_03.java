package com.ssafy.day2.array;

import java.util.Random;

/**
 * @since 2021. 7. 5.
 */
public class BasicProblem_03 {
    public static void main(String[] args) {

        int N = 6;
        Random rand = new Random();
        // TODO: 이전예제를 배열을 사용하는 형태로 변환하시오.
        int[] arr = new int[5];
        for(int i=0; i<5; i++) {
        	arr[i] = rand.nextInt(N) + 1;
        }
        
        for(int a : arr) {
        	System.out.println(a);
        }
        // END:
    }
}
