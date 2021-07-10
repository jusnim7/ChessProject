package chesstablepackage;

import piecespackage.BlackPieces;
import piecespackage.WhitePieces;

public class ChessTable {
	
	int chessTable[][] = new int[8][8];
	BlackPieces initialBlackPosition = new BlackPieces();
	WhitePieces initialWhitePosition = new WhitePieces();
	int a=1;//how many pieces?
	
	public ChessTable() {
		
		for(int l = 0; l < 8; l++) {
			for(int j = 0; j < 8; j++) {
				chessTable[l][j] = 0;
			}
		}
		
		initialWhitePosition.whitePieces(chessTable);
		initialBlackPosition.blackPieces(chessTable);

/*		
		for(int k = 0; k < 8; k++) {
			for(int x=0; x<8; x++) {
				
				System.out.println(chessTable[k][x]);
				System.out.println(">"+a+"<");
				a++;
			}
		}
*/
		
	}
	
	public void putAllPiecesInInitialPosition(int[][] vector){
		
		for(int k = 0; k < 8; k++) {
			for(int l = 0; l < 8; l++) {
				vector[k][l] = this.chessTable[k][l];
			}
		}
		
	}
	


}
