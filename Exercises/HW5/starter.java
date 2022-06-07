import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String play;
		String a;
		double money;
		double wager;
		int slot1;
		int slot2;
		int slot3;
		
		money = 100.00;
		
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your wager.");
		// return rate is 0.3 * 2 = 0.6
		System.out.println("   b. If three numbers match, you triple your wager.");
		// return rate is 0.01 * 3 = 0.03
		System.out.println("   c. If none match, you lose your wager.");
	
		System.out.println("");
		System.out.println("-------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Grand Prizes:");
		System.out.println("7-7-7   ->   200x wager!");
		// return rate is 0.001 * 200 = 0.2
		System.out.println("1-2-3   ->   20x wager!");
		System.out.println("2-3-4   ->   20x wager!");
		System.out.println("3-4-5   ->   20x wager!");
		System.out.println("4-5-6   ->   20x wager!");
		System.out.println("5-6-7   ->   20x wager!");
		System.out.println("6-7-8   ->   20x wager!");
		System.out.println("7-8-9   ->   20x wager!");
		System.out.println("8-9-10  ->   20x wager!");
		// return rate is 0.001 * 20 * 8 = 0.16
		
		System.out.println("");
		System.out.println("-------------------------------------------------------");
		System.out.println("");
		
		while (true) {
			
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y/No/no/N/n): ");
			play = sc.nextLine();
			
			if ((play.equals("No")) || (play.equals("no")) || (play.equals("N")) || (play.equals("n"))) {
				break;
			}
			else if ((play.equals("Yes")) || (play.equals("yes")) || (play.equals("Y")) || (play.equals("y"))) {
				System.out.print("You have $" + money + ". How much would you like to wager? (Input double or int value): ");
				wager = sc.nextDouble();
				a = sc.nextLine();
				
				if ((wager > 0) && (wager <= money)) {
					
					
					
					System.out.println("");
					System.out.println("Great! Good luck!");
					slot1 = rand.nextInt(10) + 1;
					slot2 = rand.nextInt(10) + 1;
					slot3 = rand.nextInt(10) + 1;
					System.out.println("Your roll is...");
					
					
					
					System.out.println("_______________");
					System.out.println(" | " + slot1 + " | " + slot2 + " | " + slot3 + " | ");
					System.out.println("_______________");
					
					if ((slot1 == slot2) && (slot1 == slot3) && (slot1 == 7))
					{
						System.out.println("You won the grand prize! Your wager has been multiplied by 200!");
						wager = wager * 200;
						money = money + wager;
						
					}
					else if ((slot1 == (slot2 - 1)) && (slot1 == (slot3 - 2)))
					{
						System.out.println("You won a grand prize! Your wager has been multiplied by 20!");
						wager = wager * 20;
						money = money + wager;
					}
					else if ((slot1 == slot2) && (slot2 == slot3))
					{
						System.out.println("You won! Your wager has been multiplied by 3!");
						wager = wager * 3;
						money = money + wager;
					}
					else if ((slot1 == slot2) || (slot1 == slot3) || (slot2 == slot3) )
					{
						System.out.println("You won! Your wager has been multiplied by 2!"); 
						wager = wager * 2;
						money = money + wager;
					}
					else 
					{
						System.out.println("You didn't win this time, better luck next time!");
						money = money - wager;
					}
					System.out.println("You now have $" + money + ".");
					System.out.println("");
					System.out.println("-------------------------------------------------------");
					
					if (money <= 0){
						System.out.println("");
						System.out.println("You've run out of money to gamble. Thanks for coming! Visit again soon!");
						break;
					}
					
				}
				if (wager > money) {
					System.out.println("You only have $" + money + ". Please try again with a smaller wager.");
				}
				if (wager <= 0){
					System.out.println("Your wager must be greater than zero. Please try again.");
				}
			}
			else {
				System.out.println("Not an understandable response. Please try again.");
			}
			System.out.println("");
			play = "default";
			
		}
		if (money > 0) {
		System.out.println("");
		System.out.println("Thanks for coming! You have $" + money + ". Visit again soon!");
		}
		
		
		
		
		
		
	}
}
