import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		int a;
		int b;
		int c;
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer(a): ");
		a = sc.nextInt();
		
		System.out.print("Please enter another integer(b): ");
		b = sc.nextInt();
		
		System.out.print("Please enter another integer(c): ");
		c = sc.nextInt();
		
		boolean A = a != b;
		
		if ( (a > b) && (a > c)	)
			{
			
				System.out.println("a is the largest inputed integer.");
			}
		
		


		if ( (b > a) &&  (b > c) )
		{
			
			System.out.println("b is the largest inputed integer.");
		}
		
	
	
		if ( (c > a) && (c > b) )
		{
			
			System.out.println("c is the largest inputed integer.");
		}
		
		
		
		
		
		if ( (a < b) && (a < c)	)
		{
			
			System.out.println("a is the smallest inputed integer.");
		}
		
		


		if ( (b < a) &&  (b < c) )
		{
			
			System.out.println("b is the smallest inputed integer.");
		}
		
	
	
		if ( (c < a) && (c < b) )
		{
			
			System.out.println("c is the smallest inputed integer.");
		}
		
	}
}
