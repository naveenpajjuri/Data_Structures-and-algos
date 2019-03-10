public class BinarySearch {

	static int binSearch(int [] arr1, int toFind,int start,int end) {
		System.out.println(start + " -- " +end + " -- chacking at "+ (start+end)/2);
		int len = arr1.length;
		if ((start == end && arr1[start] != toFind) || (start > end ) || (start < 0) || (end > arr1.length-1)) {
			return -1;
		}
		if (start == end && arr1[start] == toFind) {
			return start;
		}
		if (arr1[(start+end)/2] == toFind) {
			return (start+end)/2;
		}
		if (arr1[(start+end)/2] > toFind ) {
			return binSearch(arr1,toFind,start,(start+end)/2-1);
		} else {
			return binSearch(arr1,toFind,(start+end)/2+1,end);
		}
	}

	public static void main(String []args){
	    int[] arr1 = {1,2,4,7,8,12,15,19,24,50,69,80,100};
	    //int[] arr1 = {1,2,4};//,7,8,12,15,19,24,50,69,80,100};
	    System.out.println("Key(2) found at: "+binSearch(arr1,2,0, arr1.length-1));
	    System.out.println("Key(44) found at: "+binSearch(arr1,44,0, arr1.length-1));
	    System.out.println("Key(80) found at: "+binSearch(arr1,80,0, arr1.length-1));
    } 
}