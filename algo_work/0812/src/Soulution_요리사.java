import java.util.Scanner;

public class Soulution_요리사 {

	static int T;
	static int N, R;
	static int[][] map;
	
	static int min;
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			N = sc.nextInt();
			map = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
				}
			}
		}
		R=N/2;
		min = Integer.MAX_VALUE;
		cook(0, 0, new boolean[N]);
		System.out.println(min);
	}



	private static void cook(int start, int cnt, boolean[] v) {
		if(cnt == R) {
			//로직 
			int[]A = new int[R];
			int[]B = new int[R];
			int na=0, nb=0;
			for(int i=0; i<N; i++) {
				if(v[i]) {
					A[na++]=i;
				}else {
					B[nb++] = i;
				}
			}
			int ta=0, tb=0;
			//조합 
			
			return;
		}
		for (int i = start; i < N; i++) {
			v[i] = true;
			cook(i+1, cnt+1, v);
			v[i] = false;
			
		}
	}

}
