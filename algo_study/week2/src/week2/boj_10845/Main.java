package week2.boj_10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> queue = new LinkedList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int back = 0;

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			if (input[0].equals("push")) {
				back = Integer.parseInt(input[1]);
				queue.add(back);
			} else if (input[0].equals("front")) {
				System.out.println(queue.isEmpty() ? -1 : queue.peek());
			} else if (input[0].equals("back")) {
				System.out.println(queue.isEmpty() ? -1 : back);
			} else if (input[0].equals("size")) {
				System.out.println(queue.size());
			} else if (input[0].equals("pop")) {
				System.out.println(queue.isEmpty() ? -1 : queue.poll());
			} else if (input[0].equals("empty")) {
				System.out.println(queue.isEmpty() ? 1 : 0);
			}
		}

	}

}
