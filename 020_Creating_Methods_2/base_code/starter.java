import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b) {
		
		int x = a;
		int w = a;
		int y = b;
		int counter;
		if (b > 0) {
			counter = 1;
			while (counter < b) {
				x = x * w;
				counter = counter + 1;
			}
			return x;
		}
		else if (b < 0) {
			System.out.println("Error. Negative exponent used. Cannot return an int.");
//			counter = -1;
//			x = 1/x
//			w = 1/w
//			while (counter > b) {
//				x = x * w
//				counter = counter - 1;
//
//			}
//			return x;
	}
		
		else {
			x = 1;
			return x;
		}
		
		
		
		
//		int z = a^b;
//		return z;
		return x;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int c;

	System.out.print("What is your base number?: ");
	a = sc.nextInt();
	
	System.out.print("What is your exponent number?: ");
	b = sc.nextInt();
	
	System.out.print("Your answer is: ");
	
	c = pow(a,b);
	
	System.out.println(c);
	// System.out.println(pow(a, b));

		
	}
}
