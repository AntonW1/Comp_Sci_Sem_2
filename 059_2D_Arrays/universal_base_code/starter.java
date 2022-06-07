import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[][] arr = new int[2][5];
		
		arr[0][0] = 1000;
		arr[0][1] = 1;
		arr[0][2] = 2;
		arr[0][3] = 3;
		arr[0][4] = 4;
		arr[1][0] = 5;
		arr[1][1] = 999;
		arr[1][2] = 1;
		arr[1][3] = 10;
		arr[1][4] = 1000;
		
		double c = 0;
		
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[0].length; y++) {
				c += arr[x][y];
			}
		}
		
		System.out.println("The average value of the array is: " + (c/10));
		
	}
}
