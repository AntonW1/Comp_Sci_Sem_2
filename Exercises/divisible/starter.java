import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	
	public static void main(String args[]) {
		// Your code goes below here
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		x = sc.nextInt();
		System.out.print("Please enter another integer: ");
		y = sc.nextInt();
	
		System.out.print(checkDivisible(x, y)); 
	}
	
	static String checkDivisible(int a, int b) {
		int A = a;
		int B = b;
		int c;
		
		c = A * B;
		if (c % 3 == 0) {
			return "It is divisible by 3.";
			
		}
		else {
			return "It is not divisible by 3.";
			
}

		
	}
}
