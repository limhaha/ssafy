import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Workshop_1 {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {

			N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];

			for (int i = 0; i < N; i++) {
				String[] input = br.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(input[j]);
				}
			}

			int cnt = 0;
			int max = 0;
			int maxIdx = Integer.MAX_VALUE;
			int nx, ny;
			int temp = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					temp = find(map, i, j, map[i][j], 1);
					if (temp > max) {
						max = temp;
						maxIdx = map[i][j];
					}
					if (temp == max) {
						maxIdx = Math.min(maxIdx, map[i][j]);
					}
				}

			}
			System.out.printf("#%d ", t);
			System.out.println(maxIdx + " " + max);

		}

	}

	private static int find(int[][] ar, int r, int c, int num, int cnt) {
		for (int d = 0; d < 4; d++) {
			if (r + dx[d] >= 0 && r + dx[d] < N && c + dy[d] >= 0 && c + dy[d] < N)
				if (ar[r + dx[d]][c + dy[d]] == num + 1) {
					return find(ar, r + dx[d], c + dy[d], num + 1, cnt + 1);
				}
		}
		return cnt;
	}
}
