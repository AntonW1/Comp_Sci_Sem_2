import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int c = 0;
		Random rand = new Random();
		int[] myArray;
		myArray = new int[1000];
		while (true) {
			myArray[c] = rand.nextInt(1000) + 1;
			if (c==999) {
				break;
			}
			c++;
		}
		c = 0;
		while (true) {
			System.out.println((c + 1) + ". " + myArray[c]);
			if (c==999) {
				break;
			}
			c++;
		}



		
	}
}
