import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Workshop_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {

			int N = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			String[] s = new String[N];

			for (int i = 0; i < N; i++) {
				s[i] = input[i];
			}
			System.out.printf("#%d ", t);
			if (N % 2 == 0) {
				for (int i = 0; i < N / 2; i++) {

					System.out.print(s[i] + " " + s[N / 2 + i] + " ");

				}
				System.out.println();
			} else {
				for (int i = 0; i < N / 2; i++) {
					System.out.print(s[i] + " " + s[N / 2 + 1 + i] + " ");
				}
				System.out.print(s[N / 2]);
				System.out.println();
			}
		}
	}

}
