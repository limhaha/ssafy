import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split(" ");
		
		int[] S = new int[N];
		int[] B = new int[N];
		
		for(int i=0; i<N; i++) {
			S[i] = Integer.parseInt(input[0]);
			B[i] = Integer.parseInt(input[1]);
		}
		
		for(int i=0; i<N; i++) {
			for(int j=i; j<N-1; j++) {
				
			}
		}
	}

}
