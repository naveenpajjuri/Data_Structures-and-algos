package dynamic_programming.KnapSack;

/**
 * Created by Naveen Pajjuri on 25/05/19.
 */
public class MinimumCoins {
	public static void main(String[] args) {
		int[] denominations = {1, 2, 3};
		MinimumCoins mc = new MinimumCoins();
		System.out.println(mc.minCountsRequired(denominations,5));
		System.out.println(mc.minCountsRequired(denominations,11));
		System.out.println(mc.minCountsRequired(denominations,7));
	}

	private int minCountsRequired(int[] denominations, int sum) {
		return minCountsRequiredUtil(denominations,sum,0,0);
	}

	private int minCountsRequiredUtil(int[] denominations, int sum, int currentIndex,int coinsTillNow) {
		if (sum < 0 || denominations.length == currentIndex)
			return Integer.MAX_VALUE;
		if (sum == 0)
			return coinsTillNow;
		return Math.min(minCountsRequiredUtil(denominations,sum,currentIndex+1,coinsTillNow), minCountsRequiredUtil(denominations,sum-denominations[currentIndex],currentIndex,coinsTillNow+1) );
	}
}
