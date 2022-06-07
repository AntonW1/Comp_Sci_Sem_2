import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	String name;
	int number;
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a name: ");
	name = sc.nextLine();
	
	System.out.print("Please enter a number: ");
	number = sc.nextInt();
	
	System.out.println("");
	
	while(number>0)
	{
		System.out.print(name + " ");
		number = number - 1;
	}


		
	}
}
