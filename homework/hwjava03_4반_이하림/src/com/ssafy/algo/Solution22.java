package com.ssafy.algo;

import java.util.Scanner;

public class Solution22 {

	public static void main(String[] args) {
		int T, N, num;

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		int[] dx = { 0, 0, -1, 1 }; // 순서 상하좌우
		int[] dy = { -1, 1, 0, 0 };

		for (int testcase = 0; testcase < T; testcase++) { // 테스트케이스 만큼 반복
			N = sc.nextInt(); // map 크기
			num = sc.nextInt(); // 소금쟁이 수
			int remain = num;
			int[][] map = new int[N][N]; // 자동으로 모두 0으로 초기화

			for (int i = 0; i < num; i++) {
				int r = sc.nextInt(); // 행
				int c = sc.nextInt(); // 열
				int dir = sc.nextInt() - 1; // 방향 바로 배열요소에 넣어서 사용할거라 -1

				int nx = c;
				int ny = r;

				for (int j = 3; j >= 1; j--) {
					nx = nx + (j * dx[dir]);  // 3 -> 2 -> 1 만큼 dir 방향으로 간다. 
					ny = ny + (j * dy[dir]);

					// 범위 벗어날때, 뛰려는 자리의 값이 1일때 소금쟁이 수 -1
					if (nx < 0 || nx >= N || ny < 0 || ny >= N || map[ny][nx] == 1) {
						remain--;
						break;
					}
					if (j == 1) {         // 세번째 까지 다 뛰었을 경우 
						map[ny][nx] = 1;  // 그 자리의 수를 1로 바꿔준다
					}
				}
			}
			System.out.println("#" + (testcase + 1) + " " + remain);
		}

	}

}
