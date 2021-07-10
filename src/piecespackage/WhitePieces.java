package piecespackage;

public class WhitePieces extends ChessPieces {
	
	int whitePieces[][] = new int[2][8];

	public void whitePieces(int[][] vector) {
		
		//PUTTING PIECES IN EACH INITIAL POSITIONS [y][x]
		
		whitePieces[0][4] = getKing();	
		whitePieces[0][3] = getQueen();
		whitePieces[0][2] = getBishop();
		whitePieces[0][5] = getBishop();
		whitePieces[0][1] = getKnight();
		whitePieces[0][6] = getKnight();
		whitePieces[0][0] = getRook();
		whitePieces[0][7] = getRook();
		
		//PUTTING PIECES IN EACH INITIAL POSITIONS -- LOOP FOR PAWNS
		
		for(int k = 0; k < 8; k++) {
			
			whitePieces[1][k] = getPawn();
			
		}
		
		//TRANSFERING THE whitePieces VALUES TO vector
		for(int k = 0; k < 2; k++) {
			for(int x = 0; x < 8; x++) {
				vector[k][x] = whitePieces[k][x];
			}
			
		}
		
	}
	
}
