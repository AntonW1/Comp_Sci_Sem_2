import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		
		
		int a;
		int counter;
		counter = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		a = sc.nextInt();
		
		while (counter < 5) {
			System.out.println(a);
			a = a + 1;
			counter = counter + 1;
		}
		
	}
}
