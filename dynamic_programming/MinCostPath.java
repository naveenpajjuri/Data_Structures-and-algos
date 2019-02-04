import java.lang.*;

public class MinCostPath {
	public static int minCost (int[][] cost, int max, int min) {
		if (max < 0 || min < 0) {
			return 100000;
		}
		if (max == 0 && min == 0) {
			//System.out.println("---- "+cost[max][min]);
			return cost[max][min];
		}
		//System.out.println(cost[max][min] + " -- "+ Math.min(Math.min(minCost(cost,max -1 ,min ), minCost(cost,max  ,min -1 )),minCost(cost,max-1,min-1 )));
		return cost[max][min] + Math.min(Math.min(minCost(cost,max -1 ,min ), minCost(cost,max  ,min -1 )),minCost(cost,max-1,min-1 ));
	}
	public static void main (String args[]) {
		System.out.println("Hello");
		int cost[][] = { {1, 2, 3}, 
                         {4, 8, 2}, 
                         {1, 5, 3} }; 
                           
        System.out.println(minCost(cost, 2, 2)); 
	}
}