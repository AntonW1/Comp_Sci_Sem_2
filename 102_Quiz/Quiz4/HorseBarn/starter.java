import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		
		
	}
	
	public int findHorseSpace(String name) {
		int c = 0;
		while(true) {
			
			if (c == spaces[].length()) {
				c = -1;
				break;
			}
			
			if (name.equals(spaces[c].getName())) {
				break;
			}
			
			c++;
		}
		
		return c;
	}
	
	/*
	public void consolidate() {
		int c = 0;
		int d = 0;
		while (d < (spaces[].length() - 1)) {
			while (c < spaces[].length()) {
				if (spaces[c] == null) {
					spaces[c] = Horse[c + 1];
					spaces[c + 1] = null;
				}
				c++;
			}
			d++;
		}
		
	}
	*/
	
	public void consolidate() {
		int c = 0;
		int d = 0;
		Horse[] temp = new Horse[spaces.length()];
		
		while (c < spaces.length()) {
			if (spaces[c] != null) {
				temp[d] = spaces[c];
				d++;
			}
			c++;
		}
		
		c = 0;
		
		while(c < spaces.length()) {
			spaces[c] = temp[c];
			c++;
		}
	}
}
