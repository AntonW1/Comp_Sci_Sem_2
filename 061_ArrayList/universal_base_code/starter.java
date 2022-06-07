import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList <String> cookies = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int c = 0;
		System.out.print("How many cookies do you want to be added to the ArrayList?: ");
		c = sc.nextInt();
		for(int x = 0; x < c; x++) {
			cookies.add("cookies");
		}
		for(int x = 0; x < cookies.size(); x++) {
			System.out.println(cookies.get(x));
		}
	}
}
