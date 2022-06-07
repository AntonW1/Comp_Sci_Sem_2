import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int a;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a number and every prime up to and including will be printed (integer > 0): ");
			a = sc.nextInt();
			if (a>1) {
				System.out.println("");
				printPrimes(a);
				break;
			}
			else if (a == 1) {
				System.out.println("1 is not a prime number.");
				break;
			}
			else {
				System.out.println("Please try again. Your number must be greater than zero.");
			}
		}
		
		


		
	}
	
	static boolean checkPrime (int x) {
		int X = x;
		int c = x;
		while (true) {
			c = c - 1;
			
			if (c<=1) {
				return true;
			}
			
			if (X % c == 0) {
				break;
			}
		}
		return false;
	}
	
	static void printPrimes (int y) {
		int Y = y;
		int C = 1;
		
		while (true) {
			C = C + 1;
			
			if (checkPrime(C)) {
				System.out.println(C);
			}
			
			if (C == Y) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
