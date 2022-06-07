import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		for (int c = 0; c < 5; c++) {
			System.out.println(fibonacciSequence(c));
		}
		
		
	}
	
	public static int fibonacciSequence(int n) {
		if(n <= 1) 
			return n;
		
		return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
	
	}
}
