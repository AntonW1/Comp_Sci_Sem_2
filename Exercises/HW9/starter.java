import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] myArray;
		int[] yarrAym;
		myArray = new int [20];
		yarrAym = new int [20];
		int randNum;
		int c = 0;
		int c2 = 0;
		while (true) {
			randNum = rand.nextInt(50) + 1;
			myArray[c] = randNum;
			yarrAym[19-c] = randNum;
			if (c==19) {
				break;
			}
		c++;
		}
		System.out.println("These are the 20 numbers: ");
		while (true) {
			System.out.print(myArray[c2] + " ");
			if (c2==19) {
				break;
			}
			c2++;
		}
		c2 = 0;
		System.out.println("");
		System.out.println("These are the 20 numbers backwards: ");
		while (true) {
			System.out.print(yarrAym[c2] + " ");
			if (c2==19) {
				break;
			}
			c2++;
		}
		System.out.println("");
		
		
		
	}
}
