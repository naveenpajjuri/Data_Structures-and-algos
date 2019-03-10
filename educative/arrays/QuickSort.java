import java.util.Random;
import java.lang.*;

public class QuickSort{

	static void swap () {

	}

	static void partitionForKey (int [] arr,int pivotValue, int start,int end) {
		int i = start;
		int j = end;

		while (j > i) {
			//System.out.println("here");
			while (arr[i] < pivotValue) {
				i++;
			}
			while (arr[j] > pivotValue) {
				j--;
			}
			//System.out.println("i  -- "+i + "  j  "+j);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}



	System.out.print("pivot  -- "+ pivotValue+"\n");
	for (int k = 0; k < arr.length; k ++) {
		System.out.print(" -- "+ arr[k]);
	}
	System.out.print(" -- \n");
		return ;
	}

	static void quickSortAlgo (int [] arr, int start,int end) {
		int pivotIndex = start + (int)(Math.random() * ((end - start) + 1));
		int pivValue = arr[pivotIndex];
		  partitionForKey(arr, arr[pivotIndex], start, end);

		for (int i = 0; i < arr.length; i ++) {
			if (arr[i] == pivValue) {

			}
		}
	}

	static void quickSort(int [] arr) {
		quickSortAlgo(arr,0, arr.length -1);
	}

	public static void main(String[] args) {
	    int[] a = new int[] {33, 6, 21, 12, 19, 29, 38, 22, 14, 40};
	    partitionForKey(a,33,0,a.length-1);
	    /*
	    for (int i : a) {
	      System.out.print(i + ", ");
	    }
	    System.out.println();
	    quickSort(a);
	    System.out.println();
	    for (int i : a) {
	     System.out.print(i + ", ");
	    }
	    System.out.println();*/
	}
}