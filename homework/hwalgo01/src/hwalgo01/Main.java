package hwalgo01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int studentNum = sc.nextInt();
		int[] studentSex = new int[studentNum];

		for (int i = 0; i < studentNum; i++) {
			int sex = sc.nextInt();
			int num = sc.nextInt();

			if (sex == 1) {
				for (int j = num - 1; j < N; j += num) {
					if (arr[j] == 0) {
						arr[j] = 1;
					} else {
						arr[j] = 0;
					}
				}
			} else if (sex == 2) {
				num = num - 1;
				arr[num] = (arr[num] + 1) % 2;
				for (int j = 1; j < arr.length; j++) {
					if (num - j >= 0 && num + j < arr.length) {
						if (arr[num - 1] == arr[num + 1]) {
							arr[num - j] = (arr[num - j] + 1) % 2;
							arr[num + j] = (arr[num + j] + 1) % 2;
						} else
							break;
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + " ");
			if ((i + 1) % 20 == 0) {
				sb.setLength(sb.length() - 1);
				System.out.println(sb.toString());
				sb.delete(0, sb.length());
			}

			if (i == arr.length - 1 && (i + 1) % 20 != 0) {
				sb.setLength(sb.length() - 1);
				System.out.print(sb.toString());
			}
		}
	}
}
