package chesstablepackage;

import piecespackage.BlackPieces;
import piecespackage.WhitePieces;

public class ChessBoard {
	
	int chessBoard[][] = new int[8][8];
	BlackPieces initialBlackPosition = new BlackPieces();
	WhitePieces initialWhitePosition = new WhitePieces();
	int linha = 1;
	
	public ChessBoard() {


		
		initialWhitePosition.whitePieces(chessBoard);
		initialBlackPosition.blackPieces(chessBoard);

//-----------------------------------------------------------------	
				    //COSMETIC CHESSBOARD VIEW
		
		for(int k = 0; k < 8; k++) {
			for(int x=0; x < 8; x++) {
				
				System.out.print(chessBoard[k][x]+" ");
				
			} 
			
			System.out.println(" | l"+ linha);
			linha++;
		}
		System.out.println("------------------");
		System.out.print("a b c d e f g h");
//-----------------------------------------------------------------
		
	}
	
	public void putAllPiecesInInitialPosition(int[][] vector){
		
		for(int k = 0; k < 8; k++) {
			for(int l = 0; l < 8; l++) {
				vector[k][l] = this.chessBoard[k][l];
			}
		}
		
	}
	


}
