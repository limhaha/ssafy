package com.ssafy.day2.array;

import java.util.Scanner;

/**
 * @since 2021. 7. 6.
 */
public class BasicProblem_19 {

    public static void main(String[] args) {


        char[][] grid = {{'2', '3', '1', '4'}, 
                         {'1', 'X', '3', '2'}, 
                         {'3', '4', 'X', 'X'}, 
                         {'X', '4', '1', '5'}};

        int sum = 0;
        // TODO: X로 표시된 항목의 좌우 숫자의 합을 구하시오.
        int[] dx = {1, -1};
//        int[] dy = {0, 1, 0, -1};
        
        for(int i=0; i<4; i++) {
        	for(int j=0; j<4; j++) {
        		if(grid[i][j] == 'X') {
        			for(int d=0; d<2; d++) {
        				int nx = j + dx[d];
        				if(nx<0 || nx>=4 || grid[i][nx]=='X') {
        					continue;
        				}
        				sum += grid[i][nx] - '0';
        			}
        		}
        	}
        }
        // END:
        System.out.println(sum);
    }
}
