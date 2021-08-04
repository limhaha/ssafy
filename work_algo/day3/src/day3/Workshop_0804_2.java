package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Workshop_0804_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];

			for (int i = 0; i < N; i++) {
				String input = br.readLine();
				for (int j = 0; j < N; j++) {
					map[i][j] = input.charAt(j) - '0';
				}
			}
			int k = 0;
			int sum = 0;
			for (int i = 0; i < N / 2; i++) {
				for (int j = N / 2 - k; j <= N / 2 + k; j++) {
					sum += map[i][j];
				}
				k++;
			}
			for (int i = N / 2; i < N; i++) {
				for (int j = N / 2 - k; j <= N / 2 + k; j++) {
					sum += map[i][j];
				}
				k--;
			}
			
			System.out.printf("#%d ", t);
			System.out.println(sum);
		}
	}

}
