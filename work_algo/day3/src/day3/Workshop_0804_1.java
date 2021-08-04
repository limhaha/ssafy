package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Workshop_0804_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String[] input = br.readLine().split(" ");
			int H = Integer.parseInt(input[0]);
			int W = Integer.parseInt(input[1]);

			char[][] map = new char[H][W];
			int nh = 0;
			int nw = 0;
			
			for (int i = 0; i < H; i++) {
				String input2 = br.readLine();
				for (int j = 0; j < W; j++) {
					map[i][j] = input2.charAt(j);
					if (map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '<' || map[i][j] == '>') {
						nh = i;
						nw = j;
					}
				}
			}

			int num = Integer.parseInt(br.readLine());

			String input3 = br.readLine();
			char[] move = new char[num];
			for (int i = 0; i < num; i++) {
				if (input3.charAt(i) == 'U') {
					if (nh - 1 < 0 || nh - 1 >= H || map[nh - 1][nw] == '*' || map[nh - 1][nw] == '#'
							|| map[nh - 1][nw] == '-') {
						map[nh][nw] = '^';
						continue;
					} else {
						map[nh][nw] = '.';
						map[nh - 1][nw] = '^';
						nh--;
					}
				}

				if (input3.charAt(i) == 'D') {
					if (nh + 1 < 0 || nh + 1 >= H || map[nh + 1][nw] == '*' || map[nh + 1][nw] == '#'
							|| map[nh + 1][nw] == '-') {
						map[nh][nw] = 'v';
						continue;
					} else {
						map[nh][nw] = '.';
						map[nh + 1][nw] = 'v';
						nh++;
					}
				}

				if (input3.charAt(i) == 'L') {
					if (nw - 1 < 0 || nw - 1 >= W || map[nh][nw - 1] == '*' || map[nh][nw - 1] == '#'
							|| map[nh][nw - 1] == '-') {
						map[nh][nw] = '<';
						continue;
					} else {
						map[nh][nw] = '.';
						map[nh][nw - 1] = '<';
						nw--;
					}
				}

				if (input3.charAt(i) == 'R') {
					if (nw + 1 < 0 || nw + 1 >= W || map[nh][nw + 1] == '*' || map[nh][nw + 1] == '#'
							|| map[nh][nw + 1] == '-') {
						map[nh][nw] = '>';
						continue;
					} else {
						map[nh][nw] = '.';
						map[nh][nw + 1] = '>';
						nw++;
					}
				}

				if (input3.charAt(i) == 'S') {
					if (map[nh][nw] == '^') {
						for(int j=nh; j>=0; j--) {
							if(map[j][nw] == '*') {
								map[j][nw] = '.';
								break;
							}
							if(map[j][nw] == '#') {
								break;
							}
						}
					}
					if (map[nh][nw] == 'v') {
						for(int j=nh; j<H; j++) {
							if(map[j][nw] == '*') {
								map[j][nw] = '.';
								break;
							}
							if(map[j][nw] == '#') {
								break;
							}
						}
					}
					if (map[nh][nw] == '<') {
						for(int j=nw; j>=0; j--) {
							if(map[nh][j] == '*') {
								map[nh][j] = '.';
								break;
							}
							if(map[nh][j] == '#') {
								break;
							}
						}
					}
					if (map[nh][nw] == '>') {
						for(int j=nw; j<W; j++) {
							if(map[nh][j] == '*') {
								map[nh][j] = '.';
								break;
							}
							if(map[nh][j] == '#') {
								break;
							}
						}
					}

				}

			}
			System.out.println("#" + t + " ");
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}

}
