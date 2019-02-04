import java.lang.*;

public class CoinChange {
	public static int countTopDown (int arr[], int length,int count) {
		if (count == 0) {
			return 1;
		} else if (count < 0) {
			return 0;
		}
		if (length == 0) {
			return 0;
		}

		return count(arr,length-1,count) + count(arr,length,count-arr[length-1]);

	}

	public static int countBottomsUp (int arr[], int length,int count) {
		
	}


	public static void main (String args[]) {
		System.out.println("Hello");
		 int arr[] = {1, 2, 3}; 
        int m = arr.length; 
        System.out.println( countTopDown(arr, m, 4)); 
        System.out.println( countBottomsUp(arr, m, 4)); 
	}
}