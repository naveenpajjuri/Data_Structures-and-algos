import java.lang.*;

public class MatrixChain {

	public static int MatrixChainOrder(int arr[],int start,int end) {
		if (start == end ) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int k = start;k < end; k++) {
			int count = MatrixChainOrder(arr,start,k) + MatrixChainOrder(arr,k+1,end) + (arr[start-1]*arr[k]*arr[end]);
			if (count < min) {
				min = count;
			}
		}
		return min;

	}

	public static int MatrixChainOrderList(int p[], int i, int j) 
    { 
        if (i == j) 
            return 0; 
  
        int min = Integer.MAX_VALUE; 
  
        // place parenthesis at different places between first 
        // and last matrix, recursively calculate count of 
        // multiplications for each parenthesis placement and 
        // return the minimum count 
        for (int k=i; k<j; k++) 
        { 
            int count = MatrixChainOrder(p, i, k) + 
                        MatrixChainOrder(p, k+1, j) + 
                        p[i-1]*p[k]*p[j]; 
  
            if (count < min) 
                min = count; 
        } 
  
        // Return minimum count 
        return min; 
    } 
	 public static void main(String args[]) 
	    { 
	        int arr[] = new int[] {1, 2, 3, 4, 3}; 
	        int n = arr.length; 
	  
	        System.out.println("Minimum number of multiplications is "+ 
	                           MatrixChainOrder(arr, 1, n-1)); 
	  
	    } 
}