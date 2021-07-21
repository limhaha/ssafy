package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest1 {

	public static void main(String[] args) {
		int[] ints = new int[10];  // need 0~9 for ten's digit
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {  // infinite loop (need break statement)
			int num = sc.nextInt();
			if(num == 0) {   // break statement : input 0 
				break;
			}
			ints[num/10]++;  // divide with 10 to get ten's digit
		}
		
		for(int i=0; i<ints.length; i++) {
			if(ints[i] != 0) {
			System.out.println(i + " : " + ints[i] + "개");
			}
		}
		
	}

}
