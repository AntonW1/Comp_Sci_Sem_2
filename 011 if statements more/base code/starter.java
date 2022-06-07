import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		int a;
		int b;
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		a = sc.nextInt();
		
		System.out.print("Please enter another integer: ");
		b = sc.nextInt();
		
		boolean c = a != b;
		
			if (!c)
		{
			
			System.out.println("The variables are same.");
		}
		
		if (c)
		{
			
			System.out.println("The variables are different.");
		}
	}
}
