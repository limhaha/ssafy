import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class workshop_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int t=1; t<=10; t++) {
			
			
			int N = Integer.parseInt(br.readLine());
			
			char[] arr = new char[N];
			
			String input = br.readLine();
			
			for(int i=0; i<N; i++) {
				arr[i] = input.charAt(i);
			}
			
			int[] check = new int[8];
			
			for(int i=0; i<N; i++) {
				if(arr[i] == '(') check[0]++;
				if(arr[i] == ')') check[1]++;
				if(arr[i] == '[') check[2]++;
				if(arr[i] == ']') check[3]++;
				if(arr[i] == '{') check[4]++;
				if(arr[i] == '}') check[5]++;
				if(arr[i] == '<') check[6]++;
				if(arr[i] == '>') check[7]++;
			}
			
			int isAvail = 0;
			if(check[0] == check[1] && check[2] == check[3] && check[4] == check[5] && check[6] == check[7]) {
				isAvail = 1;
			}
			else {
				isAvail = 0;
			}
			System.out.printf("#%d ", t);
			System.out.println(isAvail);
		}
	}

}
