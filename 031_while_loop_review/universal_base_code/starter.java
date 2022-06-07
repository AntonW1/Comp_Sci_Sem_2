import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int c = 1;
		int randNum;
		Random rand = new Random();
		while (true) {
			randNum = rand.nextInt(100) + 1;
			System.out.println(c + ". " + randNum);
			if (c==100) {
				break;
			}
			c++;
		}


		
	}
}
