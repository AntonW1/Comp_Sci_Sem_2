package pkg;
import java.util.Scanner;
import java.util.Random;


public class Miner extends Piece {
//	int rank;
	
	public Miner() {
		super(3);
	}
	
	public String printPiece(int turn) {
		if ((isVisibleToPlayer1 && (turn == 1)) || (isVisibleToPlayer2 && (turn == 2))) {
			return "3";
		}
		else if (super.rank == -2) {
			return " ";
		}
		else {
			return "?";
		}
	}
	
	

//	public void isAttacked(Piece attacker) {
	//	if 
//	}
}
