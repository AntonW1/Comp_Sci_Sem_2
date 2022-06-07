import java.util.Scanner;

class modified {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		double ans1;
		double ans2;
		double ans3;
		double ans4;
		double a;
		double b;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The following expressions will be performed:");
		System.out.println("c * d % a + b");
		System.out.println("((-a) + d) % c");
		System.out.println("((a / b) * c) - d");
		System.out.println("((-a) - (-b) * (c % d) + a");
		
		System.out.print("Please enter a double for variable a: ");
			a = sc.nextDouble();
		System.out.print("Please enter a double for variable b: ");
			b = sc.nextDouble();
			
		double c = a * b;
		double d = a + b;
			
		System.out.println("c is equal to a * b");
		System.out.println("d is equal to a + b");

		ans1 = c * d % a + b;
		ans2 = ((-a) + d) % c;
		ans3 = ((a / b) * c) - d;
		ans4 = ((-a) - (-b)) * (c % d) + a;
		
		System.out.println("c * d % a + b is equal to: " + ans1);
		System.out.println("((-a) + d) % c is equal to: " + ans2);
		System.out.println("((a / b) * c) - d is equal to " + ans3);
		System.out.println("((-a) - (-b) * (c % d) + a is equal to " + ans4);
		
	}
}
