import java.lang.*;


public class EditDistance {
	public static int minEditDistance(char[] X,char[] Y,int Xlen,int Ylen) {
		int table [][] = new int [Xlen+1][Ylen+1];

		for (int i = 0 ; i <= Xlen;i++) {
			for (int j = 0 ; j <= Ylen; j++) {
				if (i ==0) {
					table[i][j] = j;
				} else if (j ==0) {
					table[i][j] = i;
				} else if (X[i-1] == Y[j-1]) {
					table[i][j] = table[i-1][j-1];
					// do nothing;
				} else {
					table[i][j] = 1 + Math.min(Math.min( table[i-1][j], table[i][j-1] ), table[i-1][j-1]);
				}
			}
		}

		return table[Xlen-1][Ylen-1];
	}

	public static void main (String args[]) {
		System.out.println("Hello");

		String s1 = "naveen"; 
        String s2 = "naieen"; 
        char[] X=s1.toCharArray(); 
        char[] Y=s2.toCharArray(); 
        int Xlen=X.length;
        int Ylen=Y.length;

        System.out.println(minEditDistance(X,Y,Xlen,Ylen));
	}
}