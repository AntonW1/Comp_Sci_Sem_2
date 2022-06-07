import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int d;
		
		System.out.print("How many rows do you want your 2D array to have?: ");
		a = sc.nextInt();
		System.out.print("How many columns do you want your 2D array to have?: ");
		b = sc.nextInt();
		
		int[][] arr = new int[a][b];
		
		for(int x = 0; x < a; x++) {
			for(int y = 0; y < b; y++) {
				arr[x][y] = (int)Math.floor(Math.random() * 10) + 1;
			}
		}
		
		System.out.print("Which row do you want the average of?: ");
		d = sc.nextInt();
		
		getRowAverage(arr, d);
		System.out.println("The average of the whole array is: " + getAverage(arr));
		printArray(arr);
		
	}
	
	public static void getRowAverage(int[][] arr, int x) {
		double c = 0;
		for(int y = 0; y < arr[0].length; y++) {
			c += arr[x][y];
		}
		c = c/(arr[0].length);
		
		System.out.println("Row " + x + " Average Value: " + c);
	}
	
	public static double getAverage(int[][] arr) {
		double c = 0;
		
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[0].length; y++) {
				c += arr[x][y];
			}
		}
		
		return (c/(arr.length * arr[0].length));
	}
	
	public static void printArray(int[][] arr) {
		
		
		System.out.print("{");
		for(int x = 0; x < arr.length; x++) {
			System.out.print("{");
			for(int y = 0; y < arr[0].length; y++) {
				System.out.print(arr[x][y]);
				if (y < (arr[0].length - 1)) {
					System.out.print(", ");
				}
			}
			if (x < (arr.length - 1)) {
				System.out.println("}");
			}
			else {
				System.out.print("}");
			}
		}
		System.out.println("}");
	}
	
}
