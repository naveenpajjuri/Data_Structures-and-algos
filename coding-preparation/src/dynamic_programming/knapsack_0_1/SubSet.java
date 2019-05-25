package dynamic_programming.knapsack_0_1;

/**
 * Created by Naveen Pajjuri on 24/05/19.
 */
public class SubSet {
	public static void main(String[] args) {
		SubSet ss = new SubSet();
		int[] num = { 1, 2, 3, 7 };
		System.out.println(ss.canPartition(num, 6));
		num = new int[] { 1, 2, 7, 1, 5 };
		System.out.println(ss.canPartition(num, 10));
		num = new int[] { 1, 3, 4, 8 };
		System.out.println(ss.canPartition(num, 6));
	}

	private boolean canPartition(int[] num, int sum) {
		return canPartitionUtil(num,sum,0);
	}

	private boolean canPartitionUtil(int[] num, int sum, int i) {
		if (i >= num.length || sum < 0)
			return false;
		if (num[i] == sum)
			return true;

		return canPartitionUtil(num,sum,i+1) || canPartitionUtil(num,sum-num[i],i+1);
	}
}
