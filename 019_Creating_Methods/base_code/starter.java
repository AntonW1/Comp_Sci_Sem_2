import java.util.Scanner;
import java.util.Random;

class starter {
	
	
	
	public static void toString(String a) {
		
		String x = a;
		System.out.println(x);
		
	}
	
	public static void toStringCombined(String a, String b) {
		
		String x = a;
		String y = b;
		String z = x + " " + y;
		System.out.println(z);
		
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		
		System.out.print("Write a sentence: ");
		a = sc.nextLine();
		
		System.out.print("Write a sentence: ");
		b = sc.nextLine();
		
		System.out.println("");
		System.out.println("This is using the methods!");
		
		toString(a);
		
		toStringCombined(a, b);
	


		
	}
}
