package bo0805;

public class SubSetTest {
	static int[] p= {1,-2,3,-4,5};
	static int N = p.length;
	static int count;
	
	public static void main(String[] args) {
		
		subset(0,0, new boolean[N]);
		System.out.println(count);
	}

	public static void subset(int cnt, int tot, boolean[] v) {
		if(N==cnt) {
//			if(tot==0) {
//				count++;
//				System.out.println(tot);
//			}
			
			for(int i=0; i<N; i++) {
				if(v[i]) {
				System.out.print(p[i] + " ");
				}
			}
			System.out.println("===>" + tot);
			System.out.println("-------------");
			return;
		}
		v[cnt] = true;
		subset(cnt+1, tot+p[cnt], v);
		v[cnt] = false;
		subset(cnt+1,tot, v);
		
	}

}
