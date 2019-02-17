import java.lang.*;

public class KnapSack {

	public static int value =0;
	public static int knapSack (int  W,int wt[],int val[],int n) {
		if (n == 0) {
			return 0;
		}

		if (W <= 0){
			return 0;
		}

		if (W-wt[n-1] < 0){
			return knapSack(W, wt, val, n-1);
		}

		value = Math.max(knapSack(W, wt, val, n-1) ,knapSack(W-wt[n-1], wt, val, n-1) + val[n-1] );

		return value;
	}


   public static void main(String args[]) { 
    	int val[] = new int[]{100, 60, 120}; 
    	int wt[] = new int[]{20, 10, 30}; 
    	int  W = 50; 
    	int n = val.length; 
    	//System.out.println(knapSackCopy(W, wt, val, n)); 
    	System.out.println(knapSack(W, wt, val, n)); 
    } 
}