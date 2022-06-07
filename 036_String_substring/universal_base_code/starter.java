import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		a = sc.nextLine();
		String[] myArray;
		myArray = new String[a.length()];
		int c = 0;
		while (c<(a.length())) {
			myArray[c] = a.substring(c, c + 1);
			System.out.print(myArray[c]);
			c++;
		}
		System.out.println("");
		c = 0;
		while (c<(a.length())) {
			myArray[c] = a.substring(c, c + 1);
			System.out.println(myArray[c]);
			c++;
		}
		//<=
		//if <
		//else =
		
	}
}
