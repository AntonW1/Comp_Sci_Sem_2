import java.util.Scanner;
import java.util.Random;

class Character {
	
	String role = new String ("Wizard");
	int Strength = 5;
	int Dexterity = 5;
	int Intelligence = 5;
	int Constitution = 5;
	int Charisma = 5;
/*	
	Strength = 5;
	Dexterity = 5;
	Intelligence = 5;
	Constitution = 5;
	Charisma = 5;
*/	
	String description = new String ("You are a " + role + ".\n" + "Your strength is " + Strength + ".\n" + "Your dexterity is " + Dexterity + ".\n" + "Your intelligence is " + Intelligence + ".\n" + "Your constitution is " + Constitution + ".\n" + "Your charisma is " + Charisma + ".\n");
	
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Character myCharacter = new Character();
		System.out.println(myCharacter.description);


		
	}
}
