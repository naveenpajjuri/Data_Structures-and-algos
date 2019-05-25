package dynamic_programming.KnapSack;

/**
 * Created by Naveen Pajjuri on 25/05/19.
 */
public class KnapSack {
	public static void main(String[] args) {
		KnapSack ks = new KnapSack();
		int[] profits = {  15, 50, 60, 90 };
		int[] weights = {  1, 3, 4, 5 };
		int maxProfit = ks.solveKnapsack(profits, weights, 8);
		System.out.println(maxProfit);
	}

	private int solveKnapsack(int[] profits, int[] weights, int capacity) {
		return solveKnapsackUtil(profits,weights,capacity,0);
	}

	private int solveKnapsackUtil(int[] profits, int[] weights, int capacity, int currentIndex) {

		if (currentIndex == weights.length || capacity <=0 || weights[currentIndex] > capacity)
			return 0;

		int cap1 = profits[currentIndex] + solveKnapsackUtil(profits,weights,capacity-weights[currentIndex],currentIndex);
		int cap2 = solveKnapsackUtil(profits,weights,capacity,currentIndex+1);
		//System.out.println("cap1 "+ cap1 + " cap2 "+ cap2);
		return Math.max(cap1,cap2);
	}
}
