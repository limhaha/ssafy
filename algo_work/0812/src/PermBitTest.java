import java.util.Arrays;

public class PermBitTest {

	static int[] p = { 1, 2, 3, 4, 5 };
	static int N = p.length;
	static int R, count;

	public static void main(String[] args) {

		R = 3;
		perm(0, 0, new int[R]);
		System.out.println(count);

	}

	private static void perm(int cnt, int flag, int[] nums) {
		if (cnt == R) {
			System.out.println(Arrays.toString(nums));
			count++;
			return;
		}
		// 000011
		for (int i = 0; i < N; i++) {
			if((flag & (i<<i))!=0) continue;
			nums[cnt] = p[i];
			perm(cnt, (flag & (i<<i) | (1<<i)), nums);
		}
	}

}
