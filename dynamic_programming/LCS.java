public class LCS {
	public static int lcsLength(char[] X, char[] Y,int Xlen,int Ylen) {
		if (Xlen == 0 || Ylen == 0) {
			return 0;
		}

		if (X[Xlen-1] == Y[Ylen-1]) {
			return 1 + lcsLength(X,Y,Xlen-1,Ylen-1);
		} else {
			return (lcsLength(X,Y,Xlen-1,Ylen)  > lcsLength(X,Y,Xlen,Ylen-1) ? lcsLength(X,Y,Xlen-1,Ylen) : lcsLength(X,Y,Xlen,Ylen-1) );
		}
	}
	public static void main (String args[]) {
		//System.out.println("Hello");

		String s1 = "AGGTAB"; 
        String s2 = "GXTXAYB"; 
        char[] X=s1.toCharArray(); 
        char[] Y=s2.toCharArray(); 
        int Xlen=X.length;
        int Ylen=Y.length;
        System.out.println(lcsLength(X,Y,Xlen,Ylen));
	}
}