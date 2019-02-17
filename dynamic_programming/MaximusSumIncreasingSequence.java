import java.lang.*;

public class MaximusSumIncreasingSequence {
	public static int maxSumIS (int arr[],int n) {
		int max = Integer.MIN_VALUE;
		int duplicate [] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			duplicate[i] = arr[i];
		}
		for (int i = 1 ; i < arr.length ; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					duplicate[i] = duplicate[i] + arr[j]; 
					if (duplicate[i] > max) {
						max = duplicate[i];
					}
				}
			}
		}
		return max;
	}
    public static void main(String args[]) 
    { 
        int arr[] = new int[]{1, 101, 2, 3, 100, 4, 5}; 
        int n = arr.length; 
        System.out.println("Sum of maximum sum "+ 
                            "increasing subsequence is "+ 
                              maxSumIS(arr, n)); 
    } 
}