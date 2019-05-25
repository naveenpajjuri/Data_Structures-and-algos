package dynamic_programming.knapsack_0_1;

/**
 * Created by Naveen Pajjuri on 25/05/19.
 */
public class TargetSum {
	public static void main(String[] args) {
		TargetSum ts = new TargetSum();
		int[] num = {1, 1, 2, 3};
		System.out.println(ts.findTargetSubsets(num, 1));
		num = new int[]{1, 2, 7, 1};
		System.out.println(ts.findTargetSubsets(num, 9));
	}

	private int findTargetSubsets(int[] num, int sum) {
		return findTargetSubsetsUtil(num,sum,0,0);
	}

	private int findTargetSubsetsUtil(int[] num, int sum,int currentIndex,int currentSum) {
		if (currentIndex == num.length) {
			if (sum == currentSum) {
				return 1;
			} else {
				return 0;
			}
		}

		return findTargetSubsetsUtil(num,sum,currentIndex+1,currentSum+num[currentIndex]) + findTargetSubsetsUtil(num,sum,currentIndex+1,currentSum-num[currentIndex]);

	}
}
