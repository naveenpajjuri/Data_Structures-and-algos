import java.lang.*;

public class MaximusSingleSellPoint {
	   
	static void find_buy_sell_stock_prices (int[] array) {
		int maxDiffSofar = Integer.MIN_VALUE;
		int correspondingMin = Integer.MAX_VALUE;
		int correspondingMax = Integer.MIN_VALUE;
		int minsoFar = Integer.MAX_VALUE;
		int currentvalue = Integer.MIN_VALUE;
		int minIndex = -1;
		int currentIndex = -1;

		for (int i =1; i < array.length; i++) {
			if (minsoFar > array[i-1]) {
				minsoFar = array[i-1];
				minIndex = i-1;
			}
			// including current index 
				currentvalue = array[i];
				currentIndex = i;
			
			if ((currentvalue - minsoFar > maxDiffSofar) && (currentIndex > minIndex)) {
				maxDiffSofar = currentvalue - minsoFar;
				correspondingMin = minsoFar;
				correspondingMax = currentvalue;
			}
		}

		System.out.println("max difference "+ maxDiffSofar + "  correspondingMin "+correspondingMin + "  correspondingMax "+ correspondingMax);
	}

	   public static void main(String[] args) {
	        int[] array = { 1, 2, 3, 4, 3, 2, 1, 2, 5 };
	        find_buy_sell_stock_prices(array);
	        //System.out.println(String.format("Buy Price: %d Sell Price: %d", result.x, result.y));

	        int[] array2 = {12,5,9,19,8};
	        find_buy_sell_stock_prices(array2);
	        //System.out.println(String.format("Buy Price: %d Sell Price: %d", result.x, result.y));

	        int[] array3 = {21,12,11,9,6,3};
	        find_buy_sell_stock_prices(array3);
	        
    }
}