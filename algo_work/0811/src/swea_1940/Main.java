package swea_1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1; t<=T; t++) {
			int N = Integer.parseInt(br.readLine());
			
			int currSpeed = 0;
			int result = 0;
			
			for(int i=0; i<N; i++) {
				String[] input = br.readLine().split(" ");
				
				int num = Integer.parseInt(input[0]);
				
				
				if(num == 0) {
					result += currSpeed;
				}
				else if (num == 1) {
					currSpeed += Integer.parseInt(input[1]);
					result += currSpeed;
				}
				else if (num == 2) {
					if(currSpeed <= Integer.parseInt(input[1])) {
						currSpeed = 0;
					}else {
					currSpeed -= Integer.parseInt(input[1]);
					}
					result += currSpeed;
				}
			}
			
			System.out.printf("#%d %d\n", t,result);
		}
		
		
	}

}
