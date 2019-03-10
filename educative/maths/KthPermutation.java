import java.util.*;

public class KthPermutation{
	
	public static List<Integer> arr = new ArrayList<Integer>();

	public static int factorial(int k) {
		if (k ==0 || k==1) {
			return 1;
		}
		return (k * factorial(k-1));
	}

	public static String getPermutation(int n, int k) {
		if (n == 0) {
			return "";
		}
		String s = "";
		int batches = factorial(n-1);
		int batch = k/batches + 1;
		s = s + arr.get(k/batches );
		arr.remove(k/batches );
		s = s + "" + getPermutation( n-1 ,k%batches );
		return s;
	}

	public static void main(String[] args) {
		int k = 0;
		int n = 4;
		int i = 1;
		while (i <= n) {
			arr.add(i);
			i++;
		}
		System.out.println("permutation = \t" + getPermutation(n, k));
  	}  
}