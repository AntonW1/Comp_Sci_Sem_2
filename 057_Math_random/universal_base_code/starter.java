import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int a = (int)Math.floor(Math.random() * 9.0);
		int b = (int)Math.floor(Math.random() * 99.0) + 1;
		double c = Math.random() + 2.5;
		double d = Math.random() * 575 + 14;
		
		System.out.println("An int between 0 and 9: " + a);
		System.out.println("An int between 1 and 10: " + b);
		System.out.println("A double between 2.5 and 3.5: " + c);
		System.out.println("A double between 14 and 589: " + d);
		
	}
}
