package workshop_2;

import java.util.Scanner;

public class Main {
	static int T;
	static int N = 9, K = N / 3;
	static int[][] sudo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			sudo = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					sudo[i][j] = sc.nextInt();
				}
			}
			boolean isP = true;
			for (int r = 0; r < N && isP; r++) {
				isP = rowCheck(new boolean[N], r);
			}
			for (int c = 0; c < N && isP; c++) {
				isP = colCheck(new boolean[N], c);
			}
			for (int r = 0; r < N && isP; r += 3) {
				for (int c = 0; c < N && isP; c += 3) {
					isP = go(new boolean[N], r, c);
				}
			}
			System.out.println("#" + t + " " + (isP ? 1 : 0));
		}

	}

	public static boolean go(boolean[] v, int r, int c) {
		for (int i = r; i < r + K; i++) {
			for (int j = c; j < c + K; j++) {
				if (v[sudo[i][j] - 1]) {
					return false;
				} else {
					v[sudo[i][j] - 1] = true;
				}
			}
		}
		return true;
	}

	public static boolean colCheck(boolean[] v, int c) {
		for (int r = 0; r < N; r++) {
			if (v[sudo[r][c] - 1]) {
				return false;
			} else {
				v[sudo[r][c] - 1] = true;
			}
		}
		return true;
	}

	public static boolean rowCheck(boolean[] v, int r) {
		for (int c = 0; c < N; c++) {
			if (v[sudo[r][c] - 1]) {
				return false;
			} else {
				v[sudo[r][c] - 1] = true;
			}
		}
		return true;
	}
}