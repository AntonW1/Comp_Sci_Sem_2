import pkg.*;
import java.util.*;

class starter {
	public static int recurPower(int base, int n){
		int output;
		if (n == 0) {
			return 1;
		}
		else {
			return (base * recurPower(base, n - 1));
		}
	}	
	
	public static int factorial(int n){
		if(n == 1)
			return 1;
		else
			return n * factorial(n-1);
	}

	public static void main(String args[]) {
		int n = 3;
		System.out.println(factorial(n));
		System.out.println(recurPower(2, 5));
	}
}
