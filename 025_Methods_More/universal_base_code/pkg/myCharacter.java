package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
//	int example = 0;
//	public int example = 0;
	
	
	String Role;
	String choice;
	int Strength;
	int Dexterity;
	int Intelligence;
	int Constitution;
	int Charisma;
	String description;
//	description = "Your role is " + Role + ".\n" + "Your strength is " + Strength + ".\n" + "Your dexterity is " + Dexterity + ".\n" + "Your intelligence is " + Intelligence + ".\n" + "Your constitution is " + Constitution + ".\n" + "Your charisma is " + Charisma + ".\n";
	
	
	
	public myCharacter () {
		Role = "No Role";
		Strength = 0;
		Dexterity = 0;
		Intelligence = 0;
		Constitution = 0;
		Charisma = 0;
		
		
		
	}
	
	public myCharacter (String x) {
		String a = x;
		System.out.println("");
		
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
		Strength = 0;
		Dexterity = 0;
		Intelligence = 0;
		Constitution = 0;
		Charisma = 0;
		
		
		
		
	}
	
	public String setRole(String a) {
		
		choice = a;
		
		System.out.println("");
		
		if ((choice.equals("Wizard")) || (choice.equals("wizard")))
		{
			System.out.println("You have chosen Wizard! You can now use magic!");
			Role = "Wizard";
		}
		
		else if ((choice.equals("Warrior")) || (choice.equals("warrior")))
		{
			System.out.println("You have chosen Warrior! Your strength has greatly increased!");
			Role = "Warrior";
		}
			
		else if ((choice.equals("Rogue")) || (choice.equals("rogue")))
		{
			System.out.println("You have chosen Rogue! Your steath has swiftly risen!");
			Role = "Rogue";
		}
			
	/*	else
		{
			System.out.println("Your choice was unsuccessful. You become a dragon!");
			choice = "Dragon";
			Role = "Dragon";
		}
	*/
		
		return Role;
		
	}
	
	public int setStrength(int a) {
		Strength = a;
		return Strength;
	}
	
	public int setDexterity(int a) {
		Dexterity = a;
		return Dexterity;
	}
	
	public int setIntelligence(int a) {
		Intelligence = a;
		return Intelligence;
	}
		
	public int setConstitution(int a) {
		Constitution = a;
		return Constitution;
	}
	
	public int setCharisma(int a) {
		Charisma = a;
		return Charisma;
	}
	
	public boolean setAll(String a, int b, int c, int d, int e, int f) {
		
		choice = a;
		
		if ((choice.equals("Wizard")) || (choice.equals("wizard")))
		{
//			System.out.println("You have chosen Wizard! You can now use magic!");
//			System.out.println("");
			Role = "Wizard";
		}
		
		else if ((choice.equals("Warrior")) || (choice.equals("warrior")))
		{
//			System.out.println("You have chosen Warrior! Your strength has greatly increased!");
//			System.out.println("");
			Role = "Warrior";
		}
			
		else if ((choice.equals("Rogue")) || (choice.equals("rogue")))
		{
//			System.out.println("You have chosen Rogue! Your steath has swiftly risen!");
//			System.out.println("");
			Role = "Rogue";
		}
			
	/*	else
		{
			System.out.println("Your choice was unsuccessful. You become a dragon!");
			choice = "Dragon";
			Role = "Dragon";
		}
	*/
		
		Strength = b;
		
		Dexterity = c;
		
		Intelligence = d;
		
		Constitution = e;
		
		Charisma = f;
		
		return true;
	}
	
	public void myToString() {
		
		description = "Your role is " + Role + ".\n" + "Your strength is " + Strength + ".\n" + "Your dexterity is " + Dexterity + ".\n" + "Your intelligence is " + Intelligence + ".\n" + "Your constitution is " + Constitution + ".\n" + "Your charisma is " + Charisma + ".\n";
		System.out.println(description);
		
	}


	

}


