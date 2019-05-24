package dynamic_programming;

/**
 * Created by Naveen Pajjuri on 23/05/19.
 */
public class EqualSum {
	public static void main(String[] args) {
		EqualSum ps = new EqualSum();
		int[] num = {1, 2, 3, 4};
		System.out.println(ps.canPartition(num));
		num = new int[]{1, 1, 3, 4, 7};
		System.out.println(ps.canPartition(num));
		num = new int[]{2, 3, 4, 6};
		System.out.println(ps.canPartition(num));
	}

	private boolean canPartition(int[] num) {
		int sum = 0;
		for (int i = 0; i< num.length; i++) {
			sum = sum + num[i];
		}
		return false;
	}
}
