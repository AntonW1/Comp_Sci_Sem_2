import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] myArray;
		myArray = new int[100];
		Random rand = new Random();
		int c = 0;
		while (true) {
			if (c==myArray.length) {
				break;
			}
			myArray[c] = rand.nextInt(100) + 1;
			c++;
		}
			
		toStringArray(myArray);
		System.out.println("The average value of the array is: " + getArrayAverage(myArray));
		System.out.println("The maximum value of the array is: " + getArrayMax(myArray));
		System.out.println("The minimum value of the array is: " + getArrayMin(myArray));
		
		
		
	}
		
	public static void toStringArray (int[] a) {
		int c2 = 0;
		while (true) {
			if (c2==a.length) {
				break;
			}
			System.out.println((c2 + 1) + ". " + a[c2]);
			c2++;
		}
		return;
	}

	public static double getArrayAverage (int[] a) {
		int c3 = 0;
		int total = 0;
		double average;
		while (true) {
			if (c3==a.length) {
				break;
			}
			total = total + a[c3];
			c3++;
		}
		average = total/(a.length);
		return average;
	}

	public static int getArrayMax (int[] a) {
		int c4 = 0;	
		int max = 0;
		while (true) {
			if (c4==a.length) {
				break;
			}
			if (a[c4] > max) {
				max = a[c4];
			}
			c4++;
		}	
		return max;
	}
	
	public static int getArrayMin (int[] a) {
		int c5 = 0;
		int min = 100;
		while (true) {
			if (c5==a.length) {
				break;
			}
			if (a[c5] < min) {
				min = a[c5];
			}
			c5++;
		}
		return min;
	}

}
