import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int c = 0;
		int previousNum = 0;
		Random rand = new Random();
		int[] myArray;
		myArray = new int[20];
		while (true) {
			if (c==myArray.length) {
				break;
			}
			myArray[c] = rand.nextInt(10) + 1;
			c++;
		}
		System.out.println("These are the 20 numbers:");
		int numbering = -1;
		c = 0;
		while (true) {
			if (c==20) {
				break;
			}
			System.out.print((numbering + 1) + ". " + myArray[c] + "   ");
			c++;
			numbering++;
		}
		System.out.println("\n------------------------------------------------------------------");
		int randNum = rand.nextInt(10) + 1;
		System.out.println("The random number to search for is " + randNum + ".");
		c = 0;
		int c2 = 0;
		while (true) {
			if (c==myArray.length) {
				break;
			}
			if (myArray[c] == randNum) {
				c2++;
				System.out.println("A duplicate is located at index " + c + ".");
			}
			c++;
		}
		System.out.println("The total number of duplicates of " + randNum + " is " + c2 + ".");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Searching for two numbers in a row.");
		c = 0;
		previousNum = 0;
		while (true) {
			if (c==myArray.length) {
				break;
			}
			if (myArray[c] == previousNum) {
				System.out.println("Two in a row located at indexes " + (c - 1) + " and " + c + ". The number is " + myArray[c] + ".");
			}
			previousNum = myArray[c];
			c++;
		}
	
		
		
		
	}
}
