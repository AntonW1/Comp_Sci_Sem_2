import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		numCombinations(2, 4);
		numCombinations(5, 3);
		
		
	}
	
	public static int factorial(int n) {
		
		int a = 1;
		
		if(n != 1) {
			while(true) {
				a = a * n;
				n--;
				if (n == 1) {
					break;
				}
			}
		}
		return a;
		
	}
	
	public static void numCombinations(int n, int r) {
		int b;
		if (r > n) {
			b = 0;
		}
		else {
			b = factorial(n)/(factorial(r) * factorial(n - r));
		}
		System.out.println("There are " + b + " ways of choosing " + r + " items from " + n + " choices.");
		
	}
}
