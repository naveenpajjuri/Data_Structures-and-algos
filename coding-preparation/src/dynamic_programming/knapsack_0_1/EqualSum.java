package dynamic_programming.knapsack_0_1;

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

		if (sum % 2 != 0)
			return false;
		sum = sum/2;
		if (sumPartition(num,sum,0) || sumPartition(num,sum,1))
			return true;

		return false;
	}

	private boolean sumPartition(int[] num, int sum, int i) {
		if (i >= num.length || sum < 0)
			return false;

		if (sum == num[i])
			return true;

		return sumPartition(num,sum-num[i],i+1) || sumPartition(num,sum,i+1);
	}
}
