package dynamic_programming.KnapSack;

/**
 * Created by Naveen pajjuri on 25/05/19.
 */
public class CoinChange {
	public static void main(String[] args) {
		CoinChange cc = new CoinChange();
		int[] denominations = {1, 2, 3};
		System.out.println(cc.countChange(denominations, 5));
	}

	private int countChange(int[] denominations, int sum) {
		return countChangeUtil(denominations,sum,0);
	}

	private int countChangeUtil(int[] denominations, int sum, int currentIndex) {
		if (sum == 0)
			return 1;
		if (currentIndex == denominations.length || sum < 0)
			return 0;

		return countChangeUtil(denominations,sum,currentIndex+1) + countChangeUtil(denominations,sum-denominations[currentIndex],currentIndex);
	}

}
