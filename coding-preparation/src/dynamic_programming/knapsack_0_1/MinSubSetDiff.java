package dynamic_programming.knapsack_0_1;

/**
 * Created by Naveen Pajjuri on 24/05/19.
 */
public class MinSubSetDiff {

	public static void main(String[] args) {
		MinSubSetDiff ps = new MinSubSetDiff();
		int[] num = {1, 2, 3, 9};
		System.out.println(ps.canPartition(num));
		num = new int[]{1, 2, 7, 1, 5};
		System.out.println(ps.canPartition(num));
		num = new int[]{1, 3, 100, 4};
		System.out.println(ps.canPartition(num));
	}

	private boolean canPartition(int[] num) {
		System.out.println(Math.min(canPartitionUtil(num,0,num[0],0),canPartitionUtil(num,0,0,num[0])));
		return false;
	}

	private int canPartitionUtil(int[] num,int index, int sum1, int sum2) {
		//System.out.println("sum1 "+sum1 + " sum2 "+sum2);
		if (index == num.length-1)
			return Math.abs(sum1-sum2);

		return Math.min(canPartitionUtil(num,index+1,sum1+num[index+1],sum2) , canPartitionUtil(num,index+1,sum1,sum2+num[index+1]));

	}
}
