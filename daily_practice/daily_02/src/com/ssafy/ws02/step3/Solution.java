package com.ssafy.ws02.step3;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int T;

		int[] dx = { 1, 1, 0, -1, -1, -1, 0, 1 };
		int[] dy = { 0, -1, -1, -1, 0, 1, 1, 1 };

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		for (int a = 0; a < T; a++) {
			int N = sc.nextInt();
			char[][] map = new char[N][N];

			for (int i = 0; i < N; i++) {
				String word = sc.next();
				char[] array_word = new char[word.length()];

				for (int j = 0; j < array_word.length; j++) {
					map[i][j] = word.charAt(j);
				}

			}

			int max = Integer.MIN_VALUE;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					if (map[i][j] == 'B') {

						int level = 0;
						
						for (int d = 0; d < 8; d++) {
							level = 0;
							int nx = j + dx[d];
							int ny = i + dy[d];

							if (nx < 0 || nx >= N || ny < 0 || ny >= N) { // out of range
								continue;
							}

							if (map[ny][nx] == 'G') {
								level = 2;
								break;
							}

							for (int l = 0; l < N; l++) {
								if (map[i][l] == 'B') {
									level++;
								}
								if (map[l][j] == 'B') {
									level++;
								}
							}
							level = level - 1;

//							if(map[nx][ny] == 'G' && nx>=0 && nx<N && ny>=0 && ny<N) {
//								level += 2;
//							}
//							else {
//								for(int l=0; l<N; l++) {
//									if(map[i][l] == 'B') {
//										level++;
//									}
//									if(map[l][j] == 'B') {
//										level++;
//									}
//								}
//								level = level -1;
//							}
							
						}
						max = Math.max(level, max);

					}

				}
			}

			System.out.println("#" + (a + 1) + " " + max);
		}

	}

}
