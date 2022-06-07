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
		for (int c = 0; c<(a.length()); c++) {
			myArray[c] = a.substring(c, c + 1);
			System.out.print(myArray[c]);
		}
		System.out.println("");
		for (int c = 0; c<(a.length()); c++) {
			myArray[c] = a.substring(c, c + 1);
			System.out.println(myArray[c]);
		}


		
	}
}
