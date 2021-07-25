package com.ssafy.day1;

import java.util.Random;

/**
 * @since 2021. 7. 5.
 */
public class BasicProblem_32 {
	public static void main(String[] args) {
		int N=6;
		Random rand = new Random();
		
		int sum = 0;
		int i=0;
		while(true) {
			int num = rand.nextInt(N) + 1;
			if(i>=100) {
				break;
			}
			sum += num;
			i++;
		}
		System.out.println(sum);
		System.out.println(sum/100.0);
	}
//    public static void main(String[] args) {
//        int N = 6;
//        int sum = 0;
//        double avg = 0;
//        Random rand = new Random();
//        int i = 0;
//        // TODO: 주사위를 100번 던진 결과의 합과 평균을 출력하시오. while 문 활용
////        while(true) {
////        	i++;
////        	if(i>100) {
////        		break;
////        	}
////        	sum += rand.nextInt(N) + 1;
////        }
//        while (i<100) {
//        	sum += rand.nextInt(N) + 1;
//        	i++;
//        }
//        avg = sum / 100.0;
//        
//        do {
//        	sum += rand.nextInt(N)+1;
//        	i++;
//        }while(i<100);
//        // END:
//        System.out.printf("sum: %d, avg: %f%n", sum, avg);
//    }
}
