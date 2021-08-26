package workshop_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] A = new int[9];
	static int[] B = new int[9];
	static boolean[] check;
	static int Asum;
	static int Bsum;
	static int win;
	static int lose;
	static int tie;
	static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder(" ");

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			win = 0;
			tie = 0;
			lose = 0;
			cnt=0;
			check = new boolean[9];
			boolean[] card = new boolean[19];
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 0; i < 9; i++) {
				A[i] = Integer.parseInt(st.nextToken());
				card[A[i]] = true;
			}

			for (int i = 1, j = 0; i < 19; i++) {
				if (!card[i]) {
					B[j++] = i;
				}
			}

			perm(0, 0, 0);
			sb.append("#").append(t).append(" ").append(win).append(" ").append(lose).append("\n");
		}
		System.out.print(sb);
	}

	static void perm(int r, int sum1, int sum2) {
		if (r == 9) { // 9라운드가 지나고, 값 비교를 통해
			cnt++; // 모든 가지수
			if (sum1 > sum2)
				win++; // 이긴 가지수
			if (sum1 < sum2)
				lose++; // 비긴 가지수 증가
			return;
		}
		for (int i = 0; i < 9; i++) { // 한 라운드당 9개의 숫자 중, 이전 라운드에서 선택이 안된 숫자를 선택.
			if (!check[i]) {
				check[i] = true;
				if (A[r] > B[i]) {
					perm(r + 1, sum1 + A[r] + B[i], sum2); // A의 숫자가 클 경우, sum1에 값을 더해준다.
				} else {
					perm(r + 1, sum1, sum2 + A[r] + B[i]); // B의 숫자가 클 경우, sum2에 값을 더해준다.
				}
				check[i] = false;
			}
		}
	}

}
