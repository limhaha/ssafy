package com.ssafy.day1;

import java.util.Random;

/**
 * @since 2021. 7. 5.
 */
public class BasicProblem_31 {
	public static void main(String[] args) {
		int N=6;
		int sum=0;
		Random rand = new Random();
		for(int i=0; i<100; i++) {
			sum += rand.nextInt(N) + 1;
		}
		System.out.println(sum);
		System.out.println(sum/100.0);
	}
	
	
	
	
	
	
	
	
//    public static void main(String[] args) {
//        int N = 6;
//        int sum = 0;
//        double avg = 0;
//        Random rand = new Random();
//        // TODO: 주사위를 100번 던진 결과의 합과 평균을 출력하시오. for 문 활용
//        for(int i=0; i<100; i++) {
//        	sum += rand.nextInt(N) + 1;
//        }
//        
//        // END:
//        avg = sum / 100.0;
//
//        
//        System.out.printf("sum: %d, avg: %f%n", sum, avg);
//    }
}
