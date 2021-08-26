package week2.boj_10866;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws Exception {
		Deque<Integer> deque = new LinkedList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			if (input[0].equals("push_front")) {
				deque.addFirst(Integer.parseInt(input[1]));
			} else if (input[0].equals("push_back")) {
				deque.addLast(Integer.parseInt(input[1]));
			} else if (input[0].equals("pop_front")) {
				System.out.println(deque.isEmpty() ? -1 : deque.pop());
			} else if (input[0].equals("pop_back")) {
				System.out.println(deque.isEmpty() ? -1 : deque.removeLast());
			} else if (input[0].equals("size")) {
				System.out.println(deque.size());
			} else if (input[0].equals("empty")) {
				System.out.println(deque.isEmpty() ? 1 : 0);
			} else if (input[0].equals("front")) {
				System.out.println(deque.isEmpty() ? -1 : deque.peek());
			} else if (input[0].equals("back")) {
				System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
			}

		}

	}
}
