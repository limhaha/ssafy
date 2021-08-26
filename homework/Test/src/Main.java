import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split(" ");
		
		int N = Integer.parseInt(input[0]);
		int R = Integer.parseInt(input[1]);
		
		for(int i=0; i<N; i++) {
			String[] input2 = br.readLine().split(" ");
			for(int j=0; j<R; j++) {
				
			}
		}
	}

}
