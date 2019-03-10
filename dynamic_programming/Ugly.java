
public class Ugly {

	public static int[] memoArray = new int[1000];

	public static int ugly(int n) {
		if (n == 1) {
			memoArray[n-1] = 1;
			return 1;
		}

		if (memoArray[n-1] != -1) {
			return memoArray[n-1];
		}
		//Math.min(ugly(n-1)*2, Math.min(ugly(n-1)*3, Math.min(ugly(n-1)*5)))
		
		int i = n;
		int min = Integer.MAX_VALUE;

		while (i > 1) {
			if (ugly(i-1)*2 > ugly(n-1)) {
				if (ugly(i-1)*2 < min) {
					min = ugly(i-1)*2;
				}
			}
			if (ugly(i-1)*3 > ugly(n-1)) {
				if (ugly(i-1)*3 < min) {
					min = ugly(i-1)*3;
				}
			}
			if (ugly(i-1)*5 > ugly(n-1)) {
				if (ugly(i-1)*5 < min) {
					min = ugly(i-1)*5;
				}
			}
			i--;
		}
		memoArray[n-1] = min;
		return min;
	}

	public static void main(String[] args) {
		for (int i =0;i < 1000; i++) {
			memoArray[i] = -1;
		}
		System.out.println(ugly(150));
  	} 
}