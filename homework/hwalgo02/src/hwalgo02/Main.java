package hwalgo02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();

			if (N == 1) {
				System.out.println("#" + t);
				System.out.println(1);
				continue;
			}
			int nx = 0;
			int ny = 0;

			int dir = 0;
			int[][] arr = new int[N][N];

			for (int i = 0; i < N * N; i++) {
				arr[nx][ny] = i + 1;
				nx = nx + dx[dir];
				ny = ny + dy[dir];

				//범위를 벗어나거나 그자리에 이미 값이 있을
				if (nx < 0 || nx >= N || ny < 0 || ny >= N || arr[nx][ny] != 0) {
					// 원상태로 복귀
					nx = nx - dx[dir];
					ny = ny - dy[dir];

					dir = (dir + 1) % 4; // 돌리기

					nx = nx + dx[dir];
					ny = ny + dy[dir];

				}

			}
			
			System.out.println("#" + t);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
