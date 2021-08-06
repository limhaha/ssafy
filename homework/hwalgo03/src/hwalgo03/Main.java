package hwalgo03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int M = Integer.parseInt(input[1]);

			int[][] map = new int[N][N];

			for (int i = 0; i < N; i++) {
				String[] input1 = br.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(input1[j]);
				}
			}
			int max = 0;
			int res = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					for (int k = i; k < i + M; k++) {
						for (int l = j; l < j + M; l++) {
							if (k >= N || l >= N)
								continue;
							max += map[k][l];
						}
					}
					res = Math.max(res, max);
					max = 0;
				}
			}
			System.out.printf("#%d ", t);
			System.out.println(res);
		}
	}
}
