package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
//	int example = 0;
//	public int example = 0;
	
	
	public String a;
	public int Strength;
	public int Dexterity;
	public int Intelligence;
	public int Constitution;
	public int Charisma;
	public String description;
	
	
	
	public myCharacter () {
		a = "No Role";
		Strength = 0;
		Dexterity = 0;
		Intelligence = 0;
		Constitution = 0;
		Charisma = 0;
		description = "Your role is " + a + ".\n" + "Your strength is " + Strength + ".\n" + "Your dexterity is " + Dexterity + ".\n" + "Your intelligence is " + Intelligence + ".\n" + "Your constitution is " + Constitution + ".\n" + "Your charisma is " + Charisma + ".\n";
		System.out.println(description);
	}

//	public Role () {
//		
//		public String description = new String ("Your role is " + role + ".\n" + "Your strength is " + Strength + ".\n" + "Your dexterity is " + Dexterity + ".\n" + "Your intelligence is " + Intelligence + ".\n" + "Your constitution is " + Constitution + ".\n" + "Your charisma is " + Charisma + ".\n");
//		
//	}
	
	public myCharacter (String a) {
//		String a;
		
	
		
//		String a = new String ("No Role");
//		a = "No Role"
		
		if ((a.equals("Wizard")) || (a.equals("wizard"))) {
				System.out.println("You have chosen Wizard! You can now use magic!");
		}
		else if ((a.equals("Warrior")) || (a.equals("warrior"))) {
			System.out.println("You have chosen Warrior! Your strength has greatly increased!");
		}
		else if ((a.equals("Rogue")) || (a.equals("rogue"))) {
			System.out.println("You have chosen Rogue! Your steath has swiftly risen!");
		}
		else {
			a = "No Role";
			System.out.println("You do not have a role. You might be a dragon! Please try again.");
		}
		
		description = "Your role is " + a + ".\n" + "Your strength is " + Strength + ".\n" + "Your dexterity is " + Dexterity + ".\n" + "Your intelligence is " + Intelligence + ".\n" + "Your constitution is " + Constitution + ".\n" + "Your charisma is " + Charisma + ".\n";
		System.out.println(description);
		
	}	
	
	


}

