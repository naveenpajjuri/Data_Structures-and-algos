import java.lang.*;


public class Bitonic {
	public static int lbs(int arr[], int n) {
		// calculate lis from left to right and 
		int [] lis = new int[arr.length];
		for ( int i = 0; i < n; i++ ) {
              lis[i] = 1; 
        }
		int [] lds = new int[arr.length];
		for ( int i = 0; i < n; i++ ) {
              lds[i] = 1; 
        }

        for (int i =1 ; i < n; i++) {
        	for (int j = 0; j < i ; j++) {
        		if (arr[i] > arr[j] && lis[i] < lis[j]+1) {
        			lis[i] = lis[j] + 1;
        		}
        	}
        }

         for (int i = n-2 ; i >= 0; i--) {
         	for (int j = n-1; j > i ; j--) {
         		if (arr[i]  > arr[j] && lds[i] < lds[j] + 1) {
         			lds[i] = lds[j] + 1;
         		}
         	}
         }

         int max = Integer.MIN_VALUE;
         for (int i =0 ; i < n; i ++) {
         	if (max < lis[i] + lds[i] - 1) {
         		max = lis[i] + lds[i] - 1;
         	}
         }

         for (int i = 0; i < n ; i++ ) {
         	System.out.println("lis[i] "+ lis[i] + " -- "+lds[i] + " ---  "+(lis[i] + lds[i] - 1));
         }

         return max;
	}

	    static int lbss( int arr[], int n ) 
    { 
        int i, j; 
  
        /* Allocate memory for LIS[] and initialize LIS values as 1 for 
            all indexes */
        int[] lis = new int[n]; 
        for (i = 0; i < n; i++) 
            lis[i] = 1; 
  
        /* Compute LIS values from left to right */
        for (i = 1; i < n; i++) 
            for (j = 0; j < i; j++) 
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) 
                    lis[i] = lis[j] + 1; 
  
        /* Allocate memory for lds and initialize LDS values for 
            all indexes */
        int[] lds = new int [n]; 
        for (i = 0; i < n; i++) 
            lds[i] = 1; 
  
        /* Compute LDS values from right to left */
        for (i = n-2; i >= 0; i--) 
            for (j = n-1; j > i; j--) 
                if (arr[i] > arr[j] && lds[i] < lds[j] + 1) 
                    lds[i] = lds[j] + 1; 
  
  
        /* Return the maximum value of lis[i] + lds[i] - 1*/
        int max = lis[0] + lds[0] - 1; 
        for (i = 1; i < n; i++) 
            if (lis[i] + lds[i] - 1 > max) 
                max = lis[i] + lds[i] - 1; 


         for (int ii = 0; ii < n ; ii++ ) {
         	System.out.println("lis[i] "+ lis[ii] + " -- "+lds[ii] + " ---  "+(lis[ii] + lds[ii] - 1));
         }

        return max; 
    } 

	public static void main (String[] args) 
    { 
        int arr[] = {12, 11, 40, 5, 3, 1}; 
        int n = arr.length; 
        System.out.println("Length of LBS is "+ lbs( arr, n )); 
    } 
}