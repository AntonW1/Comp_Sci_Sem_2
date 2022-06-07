import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Hangman {
	String guessingWord;
	int numTries;
	public Hangman () {
		guessingWord = generateWord();
		numTries = 5;
	}
	public Hangmam (int a) {
		guessingWord = generateWord();
		numTries = a;
	}
	public int guessFirst(String a, int b) {
		int x = guessingWord.subString(b).indexOf(a);
		if (x != null) {
			return x;
		}
		else {
			return -1;
		}
	}
	public boolean checkWin(boolean[] a) {
		int c = 0;
		boolean Win = false;
		while (c < (a.length() - 1)) {
			if (a[c] = a[c+1]) {
				Win = true;
			}
			if (!Win) {
				return false;
			}
			c++;
		}
		return true;
	}
	
}