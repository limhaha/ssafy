package hwalgo04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split(" ");
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		int[] ans = new int[N];
		
		for(int i=N-1; i>0; i--) {
			for(int j=i; j>=0; j--) {
				if(arr[i] < arr[j]) {
					ans[i] = j+1;
					break;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(ans[i] + " ");
		}
		
	}

}
