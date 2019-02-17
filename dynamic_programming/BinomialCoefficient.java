public class BinomialCoefficient {

	public static int binomialCoeff(int n, int k) {
		if (k == 0 || n == k) {
			return 1;
		}
	// we can optimise this using memoization.
		return binomialCoeff(n-1,k-1) + binomialCoeff(n-1,k);
	}

   public static void main(String[] args) { 
        int n = 5, k = 2; 
        System.out.printf("Value of C(%d, %d) is %d ", 
                        n, k, binomialCoeff(n, k)); 
    } 
}