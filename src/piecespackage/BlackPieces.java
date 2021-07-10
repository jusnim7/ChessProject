package piecespackage;

public class BlackPieces extends ChessPieces {
	
	int blackPieces[][] = new int[8][8];

	public void blackPieces(int[][] vector) {
		
		//PUTTING PIECES IN EACH INITIAL POSITIONS [y][x]
		
		blackPieces[7][4] = getKing();	
		blackPieces[7][3] = getQueen();
		blackPieces[7][2] = getBishop();
		blackPieces[7][5] = getBishop();
		blackPieces[7][1] = getKnight();
		blackPieces[7][6] = getKnight();
		blackPieces[7][0] = getRook();
		blackPieces[7][7] = getRook();
		
		//PUTTING PIECES IN EACH INITIAL POSITIONS -- LOOP FOR PAWNS
		
		for(int k = 0; k < 8; k++) {
			
			blackPieces[6][k] = getPawn();
			
		}
		
		//TRANSFERING THE blackPieces VALUES TO vector
		for(int k = 6; k < 8; k++) {
			for(int x = 0; x < 8; x++) {
				vector[k][x] = blackPieces[k][x];
			}
			
		}
		
	}

}
