import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static int fact(int b){
	int x = b;
	int c;
	int a;
	c = x;
	a = x;
	while(true){
		c = c - 1;
		x = x * c;
		if (c<=1) {
			return x;
		}
	}
	
		
	
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
	Scanner sc = new Scanner(System.in);
	
	int x;
	int answer;
	System.out.print("Please enter an integer: ");
	x = sc.nextInt();
	
	answer = fact(x);
	
	
	System.out.print(x + "! = " + answer);
		
	}
}
