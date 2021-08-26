package hwalgo05;

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

			int[] weight = new int[N];
			String[] input2 = br.readLine().split(" ");

			for (int i = 0; i < N; i++) {
				weight[i] = Integer.parseInt(input2[i]);
			}

			int max = 0;
			int sum = 0;

			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					sum = weight[i] + weight[j];
					if (sum <= M && max < sum) {
						max = sum;
					}
				}
			}
			if (max == 0) {
				System.out.printf("#%d %d", t, -1);
			} else {
				System.out.printf("#%d %d", t, max);
			}
			System.out.println();
		}
	}
}
