package bo0805;

import java.util.Arrays;

public class PermTest {

	static int[] p = { 1, 2, 3, 4, 5 };
	static int N = p.length;
	static int R;
	static int count;

	public static void main(String[] args) {
		R = 3;
		perm(0, new boolean[N], new int[R]);
	}

	private static void perm(int cnt, boolean[] v, int[] nums) {
		if (R == cnt) {
			count++;
			System.out.println(Arrays.toString(nums));
			return;
		}
		for (int i = 0; i < N; i++) {
			if (v[i]) continue;
			v[i] = true;
			nums[cnt] = p[i];
			perm(cnt+1, v, nums);
			v[i] = false;
		}
	}

}
