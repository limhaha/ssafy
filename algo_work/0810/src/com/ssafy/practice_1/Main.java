package com.ssafy.practice_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");

		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);

		int[] arr = new int[N];
		int cnt = 0;
		Deque<Integer> deque = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) {
			deque.addLast(i);
		}

		while (!deque.isEmpty()) {
			for (int i = 0; i < K - 1; i++) {
				deque.addLast(deque.pop());
			}
			arr[cnt] = deque.pop();
			cnt++;
		}

		StringBuilder sb = new StringBuilder();
		System.out.print("<");
		for (int i = 0; i < N; i++) {
			sb.append(arr[i]).append(", ");
		}
		sb.setLength(sb.length() - 2);
		sb.append(">");
		System.out.println(sb);
	}

}
