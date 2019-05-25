package dynamic_programming.KnapSack;

/**
 * Created by Naveen Pajjuri on 25/05/19.
 */
public class MaximumRibbonCut {
	public static void main(String[] args) {
		MaximumRibbonCut mr = new MaximumRibbonCut();
		int[] ribbonLengths = {2,3,5};
		System.out.println(mr.countRibbonPieces(ribbonLengths, 5));
	}

	private int countRibbonPieces(int[] ribbonLengths, int length) {
		return countRibbonPiecesUtil(ribbonLengths,length,0,0);
	}

	private int countRibbonPiecesUtil(int[] ribbonLengths, int length, int currentIndex,int piecesTillNow) {
		if (length == 0)
			return piecesTillNow;
		if(length < 0 || currentIndex == ribbonLengths.length)
			return Integer.MIN_VALUE;

		return Math.max(countRibbonPiecesUtil(ribbonLengths,length,currentIndex+1,piecesTillNow), countRibbonPiecesUtil(ribbonLengths,length-ribbonLengths[currentIndex],currentIndex,piecesTillNow+1));

	}
}
