import java.util.*;

public class ZerosToLeft {
	static void move_zeros_to_left_in_array (int [] arr) {
		int len = arr.length;

		int start = len-1, endOfZeros = len-1;

		while (endOfZeros > 0 && arr[endOfZeros] != 0) {
			endOfZeros--;
		}

		start = endOfZeros;
		while (start >= 0) {
			if (arr[start] != 0) {
				int temp = arr[start];
				arr[start] = arr[endOfZeros];
				arr[endOfZeros] = temp;
				while (endOfZeros > 0 && arr[endOfZeros] != 0) {
					endOfZeros--;
				}
			}
			start--;
		}
	}
	public static void main(String[] args) {
	    int[] v = new int[]{1, 10, -1, 11, 5, 0, -7, 0, 25, -35};
	    System.out.println("Original Array: "+Arrays.toString(v));
	    move_zeros_to_left_in_array(v);
	    for(int i = 0 ; i < v.length; i++) {
	      System.out.print(v[i] + ", ");
	    }
	    System.out.print("\n");
  }  
}