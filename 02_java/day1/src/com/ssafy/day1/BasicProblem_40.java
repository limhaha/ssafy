package com.ssafy.day1;

import java.util.Scanner;

/**
 * @since 2021. 7. 6.
 */
public class BasicProblem_40 {
	public static void main(String[] args) {
		System.out.println("원하는 단을 입력하세요.");
		// TODO: Scanner를 통해서 단을 입력받고 해당하는 구구단을 출력하시오.
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		// END:
	}
}
