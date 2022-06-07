import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		char c;
		int w;
		int h;
		
		System.out.print("What symbol would you like to use?: ");
		c = sc.next().charAt(0);
		System.out.print("What's the width of your box?: ");
		w = sc.nextInt();
		System.out.print("What's the height of your box?: ");
		h = sc.nextInt();
		
		System.out.println("");
		
		for(int x = 0; x < h; x++) {
			for(int y = 0; y < w; y++) {
				System.out.print(c);
			}
			System.out.println("");
		}
		
		
		
	}
}
