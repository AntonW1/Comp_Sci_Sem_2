import java.util.Scanner;

class extra {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		double x;
		double y;
		double a;
		double b;
		double c;
		double d;
		double e;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a double: ");
		x = sc.nextDouble();
		
		System.out.print("Please enter another double: ");
		y = sc.nextDouble();
		
		a = Math.max (x, y);
		b = Math.sqrt (x);
		c = Math.sqrt (y);
		d = Math.pow (x, y);
		e = Math.pow (y, x);
		
		System.out.println("The larger of the two inputed doubles is: " + a);
		System.out.println("The square root of " + x + " is equal to " + b);
		System.out.println("The square root of " + y + " is equal to " + c);
		System.out.println(x + " to the power of " + y + " is equal to " + d);
		System.out.println(y + " to the power of " + x + " is equal to " + e);


		
	}
}
