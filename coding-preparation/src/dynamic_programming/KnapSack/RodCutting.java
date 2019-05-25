package dynamic_programming.KnapSack;

/**
 * Created by Naveen Pajjuri on 25/05/19.
 */
public class RodCutting {
	public static void main(String[] args) {
		RodCutting rc = new RodCutting();
		int[] lengths = {1, 2, 3, 4, 5};
		int[] prices = {2, 6, 7, 10, 13};
		int maxProfit = rc.solveRodCutting(lengths, prices, 5);
		System.out.println(maxProfit);
	}

	private int solveRodCutting(int[] lengths, int[] prices, int maxLengh) {
		return solveRodCuttingUtil(lengths,prices,maxLengh,0);
	}

	private int solveRodCuttingUtil(int[] lengths, int[] prices, int maxLengh, int currentIndex) {
		if (currentIndex == prices.length || lengths[currentIndex] > maxLengh || maxLengh < 0)
			return 0;

		System.out.println(prices[currentIndex]+solveRodCuttingUtil(lengths,prices,maxLengh - lengths[currentIndex] ,currentIndex+1) +" -- "+ solveRodCuttingUtil(lengths,prices,maxLengh,currentIndex+1));
		return Math.max(prices[currentIndex]+solveRodCuttingUtil(lengths,prices,maxLengh - lengths[currentIndex] ,currentIndex), solveRodCuttingUtil(lengths,prices,maxLengh,currentIndex+1));
	}
}
