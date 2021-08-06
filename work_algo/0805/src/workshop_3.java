import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class workshop_3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int t=1; t<=10; t++) {
		Queue<Integer> queue = new LinkedList<Integer>();


		int T = Integer.parseInt(br.readLine());

		String[] input = br.readLine().split(" ");

		for (int i = 0; i < 8; i++) {
			queue.offer(Integer.parseInt(input[i]));
		}
		int n = 0;
		while (true) {
			n++;
			if ((queue.peek() - n) <= 0) {
				queue.poll();
				queue.offer(0);
				break;
			} else {
				queue.offer((queue.poll() - n));
				if (n >= 5) {
					n = 0;
				}
			}
		}

		System.out.printf("#%d ", T);
		for (int i = 0; i < 8; i++) {
			System.out.print(queue.poll() + " ");
		}
		System.out.println();

		}

	}

}
