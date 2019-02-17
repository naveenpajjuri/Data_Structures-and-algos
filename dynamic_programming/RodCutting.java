import java.lang.*;

public class RodCutting {
	public static int cutRodvalue(int arr[],int size,int lengthLeft) {
		if (size == 0 || lengthLeft <= 0) {
			return 0;
		}
		System.out.println(arr[size-1] + cutRodvalue(arr,size-1, lengthLeft - size)+" --- "+cutRodvalue (arr,size-1,lengthLeft));
		return Math.max(arr[size-1] + cutRodvalue(arr,size-1, lengthLeft - size) , cutRodvalue (arr,size-1,lengthLeft) );
	}
	public static int cutRod(int arr[],int size) {
		int lengthLeft = size;
		return cutRodvalue(arr, size,lengthLeft);
	}
	public static void main(String args[]) 
    { 
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
        int size = arr.length; 
        System.out.println("Maximum Obtainable Value is "+ 
                            cutRod(arr, size)); 
  
    } 
}