import java.util.Arrays;

public class PermBitTest2 {

	static int[] p = { 1, 2, 3, 4, 5 };
	static int N = p.length;
	static int R, count;

	public static void main(String[] args) {

		R = 3;
		perm(0, 0, new int[R]);
		System.out.println(count);

	
	
	do {
		count++;
		System.out.println(Arrays.toString(p));
	}while(np(N-1));
	System.out.println(count);
	
	public static boolean np(int size) 
		int i = size;
		while(i>0 && p[i-1] >=p[i]) i--;
		
		if(i==0) return false;
		int j=size;
		while(p[i-1] >=p[j]) j--;
		int temp = p[i-1];
		p[i-1] = p[j];
		p[j] = temp;
		
		int k = size;
		while(i<k) {
			
		}
		return true;
	}
}
