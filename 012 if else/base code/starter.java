import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		
		int randNum;
		int guessNum;
		Random rand = new Random();
		randNum = rand.nextInt(1000);
		randNum = randNum + 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess a number between 1 and 1000: ");
		guessNum = sc.nextInt();
		
		if (guessNum == randNum)
			{
				System.out.println("Congradulations! You guessed correctly!");
			}
		else
			{
				System.out.println("False. The correct number was: " + randNum + ".");
			}
		
	}
}
