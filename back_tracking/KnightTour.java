class KnightTour {
	public static void solveKT(){
		int [] possibleXmoves = {1,1,-1,-1,2,2,-2,-2};
		int [] possibleYmoves = {2,-2,2,-2,1,-1,1,-1};

		int board[][] = new int [8][8];
		for (int i =0; i < 8 ;i ++) {
			for (int j =0; j < 8; j++) {
				board[i][j] = -1;
			}
		}
		isBoardComplete(board);
		int position = 1;
		board[0][0] = position;
		position++;
		while (!isBoardComplete(board)) {
			boolean nextMoveMade = makeNextMove()
		}
	}
	public static boolean isBoardComplete(int board[][]) {
		for (int i =0; i < 8 ;i ++) {
			for (int j =0; j < 8; j++) {
				if (board[i][j] = -1) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String args[]) { 
        solveKT(); 
    } 
}