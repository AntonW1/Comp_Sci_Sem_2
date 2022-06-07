import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		
		String name;
		String title;
		String choice;
		int points;
		int strength;
		int dexterity;
		int intelligence;
		int constitution;
		int charisma;
		
		int loop;
		
		points = 25;
		loop = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = sc.nextLine();
		
		System.out.println("What is you title?");
		title = sc.nextLine();
		
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		
		choice = sc.nextLine();
		
		if ((choice.equals("Wizard")) || (choice.equals("wizard")))
		{
			System.out.println("You have chosen Wizard! You can now use magic!");
		}
			
		else if ((choice.equals("Warrior")) || (choice.equals("warrior")))
		{
			System.out.println("You have chosen Warrior! Your strength has greatly increased!");
		}
		
		else if ((choice.equals("Rogue")) || (choice.equals("rogue")))
		{
			System.out.println("You have chosen Rogue! Your steath has swiftly risen!");
		}
		
		else
		{
			System.out.println("Your choice was unsuccessful. You become a dragon!");
			choice = "Dragon";
		}
		
		while(true) {
		
		System.out.println("");
		System.out.println("You have 25 skill points. You may use a maximum of 10 points in each catagory (Strength, Dexterity, Intelligence, Constitution, and Charisma)");
		System.out.println("");
		
		
		
		System.out.print("Strength (1-10): ");
		strength = sc.nextInt();
		if (strength > 10)
		{
			System.out.println("Error. You entered you used too many points. The maximum is 10 points. Your stength will be 10.");
			strength = 10;
		}
		if (strength < 0)
		{
			System.out.println("Error. Negative points cannot be used. The minimum is 0 points. Your stength will be 0.");
			strength = 0;
		}
		points = points - strength;
		System.out.println("You have " + points + " points left to spend.");
		System.out.println("");
		
		
		
		System.out.print("Dexterity (1-10): ");
		dexterity = sc.nextInt();
		if (dexterity > 10)
		{
			System.out.println("Error. You entered you used too many points. The maximum is 10 points. Your dexterity will be 10.");
			dexterity = 10;
		}
			if (dexterity < 0)
		{
			System.out.println("Error. Negative points cannot be used. The minimum is 0 points. Your dexterity will be 0.");
			dexterity = 0;
		}
		points = points - dexterity;
		System.out.println("You have " + points + " points left to spend.");
		System.out.println("");
		
		
		
		System.out.print("Intelligence (1-10): ");
		intelligence = sc.nextInt();
		if (intelligence > 10)
		{
			System.out.println("Error. You entered you used too many points. The maximum is 10 points. Your intelligence will be 10.");
			intelligence = 10;
		}
			if (intelligence < 0)
		{
			System.out.println("Error. Negative points cannot be used. The minimum is 0 points. Your intelligence will be 0.");
			intelligence = 0;
		}
		points = points - intelligence;
		System.out.println("You have " + points + " points left to spend.");
		System.out.println("");
		
		
		
		System.out.print("Constitution (1-10): ");
		constitution = sc.nextInt();
		if (constitution > 10)
		{
			System.out.println("Error. You entered you used too many points. The maximum is 10 points. Your constitution will be 10.");
			constitution = 10;
		}
			if (constitution < 0)
		{
			System.out.println("Error. Negative points cannot be used. The minimum is 0 points. Your constitution will be 0.");
			constitution = 0;
		}
		points = points - constitution;
		System.out.println("You have " + points + " points left to spend.");
		System.out.println("");
		
		
		
		System.out.print("Charisma(1-10): ");
		charisma = sc.nextInt();
		if (charisma > 10)
		{
			System.out.println("Error. You entered you used too many points. The maximum is 10 points. Your charisma will be 10.");
			charisma = 10;
		}
			if (charisma < 0)
		{
			System.out.println("Error. Negative points cannot be used. The minimum is 0 points. Your charisma will be 0.");
			charisma = 0;
		}
		points = points - charisma;
		
		if (points < 0)
		{
			System.out.println("");
			System.out.println("Error. You entered you used too many points. Please try again.");
			points = 25;
		}
		else
		{
			System.out.println("");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("You are " + name + " " + title);
			System.out.println("You're a " + choice + " with the following stats!");
			System.out.println("Strength - " + strength);
			System.out.println("Dexterity - " + dexterity);
			System.out.println("Intelligence - " + intelligence);
			System.out.println("Constitution - " + constitution);
			System.out.println("Charisma - " + charisma);
			System.out.println("");
			System.out.println("Good luck on your adventure " + name + "!");
			
			break;
		}
		
		}
		
	}
}
