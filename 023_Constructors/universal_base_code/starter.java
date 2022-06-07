import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter characterDefined = new myCharacter();
		
		
		
		
		String choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What class would you like to be?");
		choice = sc.nextLine();
		
		myCharacter characterEmpty = new myCharacter(choice);
	
	
	
	
	
	
	/*	
		if ((choice.equals("Wizard")) || (choice.equals("wizard")))
		{
			characterDefined.Role = "wizard";
		
		}
			
		else if ((choice.equals("Warrior")) || (choice.equals("warrior")))
		{
			characterDefined.Role = "warrior";
			
		}
		
		else if ((choice.equals("Rogue")) || (choice.equals("rogue")))
		{
			characterDefined.Role = "rogue";
			
		}
		
		else
		{
			characterDefined.Role = "dragon";
			
		}
		*/

		
	}
}
