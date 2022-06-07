import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		String phrase;
		System.out.print("Please enter a phrase: ");
		phrase = sc.nextLine();
		int c = 0;
		int x = 0;
	//	String[] myArray;
	//	myArray = new String[];
		
		
	
	
		// counts number of words in phrase
//		if (phrase.substring(x).indexOf(" ") == 0) {
//			c++;
//			x = phrase.substring(x).indexOf(" ") + 1;
//		}
//		while(true) {
//			if (phrase.substring(x).indexOf(" ") == 0) {
//				break;	
//			}
//			c++;
//			x = phrase.substring(x).indexOf(" ") + 1;
//		}
		while (true) {
		if (phrase.indexOf(" ", x) != 0) {
			c++;
			x = phrase.indexOf(" ", x);
		}
		else {
			break;
		}
		
		
		int index = 0;
		for (char x : phrase) {
			if (x = " ") {
				c++;
			}
		index++;
		
		}
	//	}
		
//		phrase.substring(phrase.indexOf(" "));
		
		}
		System.out.println(c); 
		


		
	}
}
