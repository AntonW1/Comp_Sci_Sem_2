import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String choice;
		Scanner sc = new Scanner(System.in);
		
		myCharacter ant = new myCharacter();
		ant.myToString();
		
		System.out.println("What class would you like to be?");
		choice = sc.nextLine();
		
		myCharacter Ant = new myCharacter(choice);
		Ant.myToString();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
