

public class LIS {

	/*public static int max_ref; 
	public static int LISlength(int [] inputArr,int upToIndex) {
		//int [] lis = new int[inputArr.length];
		int maxTillNow = 1;
		if (upToIndex == 1) {
			return 1;
		}

		for (int i = 1; i < inputArr.length ; i ++) {
			int lisTillNow = LISlength(inputArr,i);
			if (inputArr[i-1] < inputArr[upToIndex-1] && lisTillNow + 1 > maxTillNow) {
				maxTillNow = lisTillNow+1;
			}
		}

		if (max_ref < maxTillNow){
			max_ref = maxTillNow;
		}
		return maxTillNow;
	}*/

	public static int LIS(int [] inputArr,int n) {
		int [] lis = new int[inputArr.length];
		for ( int i = 0; i < n; i++ ) {
              lis[i] = 1; 
          }
        int i,j,max = 0;
        for ( i = 1; i < n; i++ )  {
        	for ( j = 0; j < i; j++ ) {
        		 if ( inputArr[i] > inputArr[j] && lis[i] < lis[j] + 1) {
        		 	lis[i] = lis[j] + 1; 
        		 }
        	}
          }

           for ( i = 0; i < n; i++ ) 
              if ( max < lis[i] ) 
                 max = lis[i]; 

System.out.println("-------------");
for (int k =0 ; k < lis.length; k ++) {
	System.out.println("lis[i]  "+ lis[k]);
}
          return max;
	}

	public static void main (String args[]) {
		int [] inputArr = new int [] {10, 22, 9, 33, 21, 50, 41, 60, 80};
		System.out.println(LIS(inputArr,inputArr.length));
	}
}