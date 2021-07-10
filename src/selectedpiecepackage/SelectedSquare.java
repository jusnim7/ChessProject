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
	private char firstKey;
	private int firsKeyToInt;
	private int secondKey;
	int[][] gameBoard = new int[8][8];
	// ---------------------------------------------------------------------------------------------------------------------------------------

	// CONSTRUCTOR METHOD
	public SelectedSquare() {

		initialChessPosition.putAllPiecesInInitialPosition(gameBoard); // PUTTING VALLUS FROM THE METHOD INTO gameBoard

		firstKey = input.next().charAt(0);
		secondKey = input.nextInt();

		// TRANSFROMING CHAR INTO A NUMBER (HAS TO BE INT)
		for (int k = 0; k < 16; k++) {

			if (firstKey == letterChessPositions.charAt(k)) {
				firsKeyToInt = 1 + k / 2;
			}
		}
		
		if (gameBoard[firsKeyToInt][secondKey] == piece.getPawn()) {

		} else if (gameBoard[firsKeyToInt][secondKey] == piece.getRook()) {

		} else if (gameBoard[firsKeyToInt][secondKey] == piece.getKnight()) {

		} else if (gameBoard[firsKeyToInt][secondKey] == piece.getBishop()) {

		} else if (gameBoard[firsKeyToInt][secondKey] == piece.getQueen()) {

		} else if (gameBoard[firsKeyToInt][secondKey] == piece.getKing()) {

		}
		
		

	}

}
