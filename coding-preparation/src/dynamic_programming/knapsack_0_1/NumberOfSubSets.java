package dynamic_programming.knapsack_0_1;

/**
 * Created by Naveen Pajjuri on 24/05/19.
 */
public class NumberOfSubSets {
	public static void main(String[] args) {
		NumberOfSubSets ss = new NumberOfSubSets();
		int[] num = {1, 1, 2, 3};
		System.out.println(ss.countSubsets(num, 4));
		num = new int[]{1, 2, 7, 1, 5};
		System.out.println(ss.countSubsets(num, 9));
	}

	private int countSubsets(int[] num, int target) {
		return countSubsetsUtil(num,0,target);
	}

	private int countSubsetsUtil(int[] num, int i, int target) {
		if (target < 0)
			return 1;
		if (target >= 0 && num.length == i)
			return 0;

		return countSubsetsUtil(num,i+1,target-num[i]) + countSubsetsUtil(num,i+1,target);
	}

}
