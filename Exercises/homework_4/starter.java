import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer(a): ");
		a = sc.nextInt();
		
		System.out.print("Please enter another integer(b): ");
		b = sc.nextInt();
		
		
		
		
		if (a % 2 == 0) {
		System.out.println("a is even.");
		}
		else {
		System.out.println("a is odd.");
		}
		
		
		
		if (b % 2 == 0) {
		System.out.println("b is even.");
		}
		else {
		System.out.println("a is odd.");
		}
		
		
		
		
		
		
		if ((a % 3 == 0) && (a % 4 == 0) && (a % 5 == 0)) {
			System.out.println("a is divisible by 3, 4, and 5.");
		}
		else if ((a % 3 == 0) && (a % 4 == 0)) {
			System.out.println("a is divisible by 3 and 4.");
			System.out.println("a is not divisible by 5.");
		}
		else if ((a % 3 == 0) && (a % 5 == 0)) {
			System.out.println("a is divisible by 3 and 5.");
			System.out.println("a is not divisible by 4.");
		}
		else if ((a % 4 == 0) && (a % 5 == 0)) {
			System.out.println("a is divisible by 4 and 5.");
			System.out.println("a is not divisible by 3.");
		}
		else if (a % 3 == 0) {
			System.out.println("a is divisible by 3.");
			System.out.println("a is not divisible by 4 or 5.");
		}
		else if (a % 4 == 0) {
			System.out.println("a is divisible by 4.");
			System.out.println("a is not divisible by 3 or 5.");
		}
		else if (a % 5 == 0) {
			System.out.println("a is divisible by 5.");
			System.out.println("a is not divisible by 3 or 4.");
		}
		else {
			System.out.println("a is not divisible by 3, 4, or 5.");
		}
		
		
		
		
		
		if ((b % 3 == 0) && (b % 4 == 0) && (b % 5 == 0)) {
			System.out.println("b is divisible by 3, 4, and 5.");
		}
		else if ((b % 3 == 0) && (b % 4 == 0)) {
			System.out.println("b is divisible by 3 and 4.");
			System.out.println("b is not divisible by 5.");
		}
		else if ((a % 3 == 0) && (a % 5 == 0)) {
			System.out.println("b is divisible by 3 and 5.");
			System.out.println("b is not divisible by 4.");
		}
		else if ((a % 4 == 0) && (a % 5 == 0)) {
			System.out.println("b is divisible by 4 and 5.");
			System.out.println("b is not divisible by 3.");
		}
		else if (a % 3 == 0) {
			System.out.println("b is divisible by 3.");
			System.out.println("b is not divisible by 4 or 5.");
		}
		else if (a % 4 == 0) {
			System.out.println("b is divisible by 4.");
			System.out.println("b is not divisible by 3 or 5.");
		}
		else if (a % 5 == 0) {
			System.out.println("b is divisible by 5.");
			System.out.println("b is not divisible by 3 or 4.");
		}
		else {
			System.out.println("b is not divisible by 3, 4, or 5.");
		}
		
		
		
		
		
	}
}
