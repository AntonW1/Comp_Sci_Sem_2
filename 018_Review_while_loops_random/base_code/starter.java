import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int randNum;
	int guessNum;
	int counter;
	counter = 0;
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	randNum = rand.nextInt(1000) + 1;
	
	
	
	while(true)
	{
		System.out.print("Guess a number (1-1000): ");
		guessNum = sc.nextInt();
		counter = counter + 1;
		
		if (guessNum == randNum)
		{
			System.out.println("You guessed it! It took " + counter + " tries.");
			break;
		}
		else if (guessNum > randNum)
		{
			System.out.println("You're a little too high!");
		}
		else if (guessNum < randNum)
		{
			System.out.println("You're a little too low!");
		}
		
	
		
			
	}


		
	}
}
