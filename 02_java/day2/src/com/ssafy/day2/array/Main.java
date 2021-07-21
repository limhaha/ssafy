package com.ssafy.day2.array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ctrl shift + o
		Scanner sc = new Scanner(System.in);
		int r, c;
		int[] dx = {1, 0, -1, 0}; // 우 하 좌 상 (시계방향)
		int[] dy = {0, -1, 0, 1};
		
		r = sc.nextInt();
		c = sc.nextInt();
		
		char[][] map = new char[r][c];  //배열은 기본 데이터 타입(0)으로 초기화 된다.
		

		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				map[i][j] = sc.next().charAt(0);
			}
		}
		
		int sum = 0;
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(map[i][j] == 'X') {
					//상하좌우 값 더하기
					for(int d=0; d<4; d++) {
						int nx = j + dx[d];
						int ny = i + dy[d];
						
						if(nx<0 || nx>=c || ny>=r || ny<0) { // 범위를 벗어나는 경우
							continue;
						}
						if(map[ny][nx] == 'X') {
							continue;
						}
						sum += map[ny][nx] - '0'; // 문자열값만큼 빼준다 
						map[ny][nx] = '0';
					}
				}
			}
		}
		
		System.out.println(sum);
	}

}
