
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i =0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int M = sc.nextInt();
		int[] srch = new int[M];
		
		for(int i=0; i<M; i++) {
			srch[i] = sc.nextInt();
		}
		
		for(int i =0; i<M; i++) {
			if(Arrays.binarySearch(arr, srch[i]) >= 0) {
				System.out.print(1 + " ");
			}
			else {
				System.out.print(0 +  " ");
			}
		}
	}

}
