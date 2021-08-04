package com.ssafy.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkShop0802 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		for (int t = 0; t < N; t++) {
			int cnt = 0;
			char c = '1';
			String numList = in.readLine();

			for (int i = 0; i < numList.length(); i++) {
				if (numList.charAt(i) == c) {
					cnt++;
					if (c == '0') {
						c = '1';
					} else {
						c = '0';
					}
				}
			}
			System.out.println("#" + (t+1) + " " + cnt);
		}
	}
}
