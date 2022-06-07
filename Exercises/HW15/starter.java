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
		long f = 1;
		boolean sum;
		
		while(true) {
			if (c == a) {
				break;
			}
			
			testNum = squareBase * squareBase;
			
			while(true) {
				factorial = factorial + f;
				f++;
				
				if (factorial == testNum) {
					sum = true;
					break;
				}	
				if (factorial > testNum) {
					sum = false;
					break;
				}
			}
			if (sum) {
			c++;
			System.out.println(c + ". " + testNum);
			}
			
			squareBase++;
		}
		
	}
	
	
	
	
	

}