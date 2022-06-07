package pkg;
import java.util.Scanner;
import java.util.Random;


public class X extends Piece {
//	int rank;
	
	public X(int rank) {
		super(rank);
		
	}
	
	public String printPiece(int turn) {
		if ((isVisibleToPlayer1 && (turn == 1)) || (isVisibleToPlayer2 && (turn == 2))) {
			return "X";
		}
		else if (super.rank == -2) {
			return " ";
		}
		
		else {
			return "?";
		}
	}
	

}
