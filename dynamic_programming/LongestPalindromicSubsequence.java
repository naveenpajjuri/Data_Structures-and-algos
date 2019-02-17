import java.lang.*;

public class LongestPalindromicSubsequence {

	public static int lps (char [] str,int start,int end) {
		if (start > end) {
			return 0;
		}
		if (start == end) {
			return 1;
		}
		if (str[start] == str[end]) {
			return 2 + lps(str,start+1,end-1);//Math.min(lps(str))
		} else {
			return Math.max(lps(str,start,end-1),lps(str,start+1,end));
		}
		//return 0;
	}
    public static void main(String[] args) { 
        String seq = "BBABCBCAB"; 
        int n = seq.length(); 
        System.out.println("The length of the LPS is--  "+ lps(seq.toCharArray(), 0, n - 1)); 
  
    } 
}