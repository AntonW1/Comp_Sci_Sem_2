import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		
		String choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		
		choice = sc.nextLine();
		
		if (choice.equals("Wizard"))
		{
			System.out.println("You have chosen Wizard! You can now use magic!");
		}
			
		else if (choice.equals("Warrior"))
		{
			System.out.println("You have chosen Warrior! Your strength has greatly increased!");
		}
		
		else if (choice.equals("Rogue"))
		{
			System.out.println("You have chosen Rogue! Your steath has swiftly risen!");
		}
		
		else
		{
			System.out.println("Your choice was unsuccessful. You become a dragon!");
		}
			
		
	}
}
