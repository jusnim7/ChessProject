package selectedpiecepackage;

import java.util.Scanner;

import chesstablepackage.ChessBoard;
import piecesmovementpackage.King;
import piecespackage.ChessPieces;

public class SelectedSquare {

	// INITIATING ATTRIBUTES
	// -----------------------------------------------------------------------------------------------------------------
	ChessBoard initialChessPosition = new ChessBoard();
	Scanner input = new Scanner(System.in);
	ChessPieces piece = new ChessPieces();

	String letterChessPositions = "AaBbCcDdEeFfGgHh";
	private char firstKey; //FROM
	private int firstKeyToInt; //FROM
	private int secondKey; //FROM
	private char thirdKey;
	private int thirdKeyToInt; //TO
	private int fourthKey; //TO
	int[][] gameBoard = new int[8][8];
	// ---------------------------------------------------------------------------------------------------------------------------------------

	// CONSTRUCTOR METHOD
	public SelectedSquare() {

		initialChessPosition.putAllPiecesInInitialPosition(gameBoard); // PUTTING VALLUS FROM THE METHOD INTO gameBoard

		//READING THE CURRENT AND FUTURE SQUARE (example: e2 to e4)
		firstKey = input.next().charAt(0);
		secondKey = input.nextInt();
		thirdKey = input.next().charAt(0);
		fourthKey = input.nextInt();

		// TRANSFROMING CHAR INTO A NUMBER (HAS TO BE INT)
		for (int k = 0; k < 16; k++) {

			if (firstKey == letterChessPositions.charAt(k)) {
				firstKeyToInt = 1 + k / 2;
			}
		}
		
		if (gameBoard[firstKeyToInt][secondKey] == piece.getPawn()) {
			
			
			
			

		} else if (gameBoard[firstKeyToInt][secondKey] == piece.getRook()) {

		} else if (gameBoard[firstKeyToInt][secondKey] == piece.getKnight()) {

		} else if (gameBoard[firstKeyToInt][secondKey] == piece.getBishop()) {

		} else if (gameBoard[firstKeyToInt][secondKey] == piece.getQueen()) {

		} else if (gameBoard[firstKeyToInt][secondKey] == piece.getKing()) {

		}
		
		

	}

}
