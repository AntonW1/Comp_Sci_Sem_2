class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		
		int a = 4;
		int b = 3;
		int c = a * b;
		int d = a + b;
		
		double ans1 = c * d % a + b;
		double ans2 = ((-a) + d) % c;
		double ans3 = ((a / b) * c) - d;
		double ans4 = ((-a) - (-b)) * (c % d) + a;
		
		System.out.println("a is equal to 4");
		System.out.println("b is equal to 3");
		System.out.println("c is equal to a * b");
		System.out.println("d is equal to a + b");

		System.out.println("c * d % a + b is equal to: " + ans1);
		System.out.println("((-a) + d) % c is equal to: " + ans2);
		System.out.println("((a / b) * c) - d is equal to: " + ans3);
		System.out.println("((-a) - (-b) * (c % d) + a is equal to: " + ans4);
	
		
		
	}
}
