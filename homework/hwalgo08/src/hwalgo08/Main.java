package hwalgo08;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Person = new int[9];
		int f1 = 0, f2 = 0;
		int sum = 0;
		for (int i = 0; i < Person.length; i++) {
			Person[i] = sc.nextInt();
			sum += Person[i];
		}
		Arrays.sort(Person);
		for (int i = 0; i < Person.length; i++) {
			for (int j = 1; j < 9; j++) {
				if (Person[i] + Person[j] == sum - 100) {
					f1 = i;
					f2 = j;
					break;
				}
			}
		}
		for (int i = 0; i < Person.length; i++) {
			if (i == f1 || i == f2) {
				continue;
			}
			System.out.println(Person[i]);
		}

	}

}