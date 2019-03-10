import java.util.*;

public class RotateArray {

	static int[] reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
      		arr[start] = arr[end];
      		arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	static void rotate_array(int [] arr, int n) {
    //TODO: Write - Your - Code
		// reverse the array
		arr = reverse (arr, 0, arr.length-1);
		arr = reverse(arr,0,n-1);
		arr = reverse(arr,n,arr.length-1);
	}

	public static void main (String args[]) {
		List<Integer> v1 = Arrays.asList(1, 2, 3, 4, 5);
		int arr[]={1, 2, 3, 4, 5};
 		System.out.println("Array Before Rotation\n"+v1);
		rotate_array(arr, 2);
		System.out.println("Array After Rotation\n"+ arr[0] + " "+ arr[1] + " "+arr[2] + " "+ arr[3] + " "+ arr[4]);
	}
}