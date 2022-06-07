import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int c = 0;
		int min = 100;
		int max = 0;
		int total = 0;
		double average = 0.0;
		Random rand = new Random();
		int[] myArray;
		myArray = new int[rand.nextInt(149) + 52];
		while (true) {
			if (c==myArray.length) {
				break;
			}
			myArray[c] = rand.nextInt(100) + 1;
			c++;
		}
		c = 0;
		while (true) {
			if (c==myArray.length) {
				break;
			}
			if (myArray[c] < min) {
				min = myArray[c];
			}
			if (myArray[c] > max) {
				max = myArray[c];
			}
			total = total + myArray[c];
			c++;
		}
		average = total/(myArray.length);
		System.out.println("The array has " + myArray.length + " elements.");
		System.out.println("Its minimum value is equal to: " + min);
		System.out.println("Its maximum value is equal to: " + max);
		System.out.println("Its average value is about: " + average);


		
	}
}
