import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
	Scanner sc = new Scanner(System.in);
	
	int x;
	int c;
	int a;
	System.out.print("Please enter an integer: ");
	x =sc.nextInt();
	c = x;
	a = x;
	while(c>1){
		c = c - 1;
		x = x * c;
	}
	System.out.print(a + "! = " + x);
		
	}
}
