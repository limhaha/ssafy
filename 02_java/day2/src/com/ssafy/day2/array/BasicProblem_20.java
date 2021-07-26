package com.ssafy.day2.array;

import java.util.Scanner;

/**
 * @since 2021. 7. 6.
 */
public class BasicProblem_20 {
	public static void main(String[] args) {
//		int[][] deltas = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		char[][] grid = { { '2', '3', '1', '4' }, { '1', 'X', '3', '2' }, { '3', '4', 'X', 'X' },
				{ 'X', '4', '1', '5' } };

		int sum = 0;
		// TODO: X로 표시된 항목의 상하좌우 숫자의 합을 구하시오. 단 합을 구할때 이미 사용된 숫자는 다시 사용하지 않음.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (grid[i][j] == 'X') {
					for (int d = 0; d < 4; d++) {
						int nx = j + dx[d];
						int ny = i + dy[d];
						if (nx < 0 || nx >= 4 || ny < 0 || ny >= 4 || grid[ny][nx] == 'X') {
							continue;
						}
						sum += grid[ny][nx] - '0';
						grid[ny][nx] = '0';
					}
				}
			}
		}
		// END:
		System.out.println(sum);
	}
}
