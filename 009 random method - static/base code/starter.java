import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		int rand_num1;
		int rand_num2;
		double rand_num3;
		double rand_num4;
		
		Random rand = new Random();
		rand_num1 = rand.nextInt(10);
		rand_num2 = rand.nextInt(10);
		rand_num2 = rand_num2 + 1;
		rand_num3 = rand.nextDouble();
		rand_num3 = rand_num3 + 2.5;
		rand_num4 = rand.nextDouble();
		rand_num4 = rand_num4 * 575 + 14;
		
		System.out.println("A number between 0 - 9: " + rand_num1);
		System.out.println("A number between 1 - 10: " + rand_num2);
		System.out.println("A number between 2.5 - 3.5: " + rand_num3);
		System.out.println("A number between 14 - 589: " + rand_num4);



	}
}
