package hwalgo06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] map = new int[100][100];
		
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					map[k][j] = 1;
				}
			}
			
		}
		int sum = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(map[i][j] == 1) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}

}
