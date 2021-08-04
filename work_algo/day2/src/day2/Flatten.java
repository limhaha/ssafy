package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Flatten {

	public static void main(String[] args) {

		int[] arr = new int[100];
		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {

			int dumpNum = sc.nextInt();

			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);
			
			for(int i=0; i<dumpNum; i++) {
				arr[0]++;
				arr[99]--;
				Arrays.sort(arr);
			}

			System.out.println("#" + t + " " + (arr[99] - arr[0]));
		}
	}

}
