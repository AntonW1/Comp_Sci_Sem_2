import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many \"special squares\" would you like?: ");
		n = sc.nextInt();
		
		specialSquare(n);
		
	}
	
	
	
	
	
	
	

	public static void specialSquare(int a) {
		int c = 0;
		long testNum = 0;
		int squareBase = 1;
		long factorial = 0;
		
		while(true) {
			if (squareBase == a) {
				break;
			}
			
				testNum = squareBase * squareBase;
				factorial = factorial + squareBase;
				System.out.println("fact: " + factorial + "   test: " + testNum + "   square: " + squareBase);
	//			if (squareBase == 10) {
	//				break;
	//			}
				squareBase++;
				if (factorial == testNum) {
					c++;
					System.out.println(c + ". " + testNum);
				}	
			
			
			
		}
		
	}
	
	
	
	
	

}