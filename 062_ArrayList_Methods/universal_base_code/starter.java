import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> arr = new ArrayList<Integer>();
		int c = 0;
		
		while(true) {
			c = 0;
			System.out.print("How many values do you want the ArrayList to have?: ");
			c = sc.nextInt();
			
			for(int x = 0; x < c; x++) {
				arr.add(x, (int)((Math.floor(Math.random() * 100))) + 1);
			}
			
			toStringArrayList(arr);
			System.out.println("");
			System.out.println("ArrayList maximum value: " + getArrayListMax(arr));
			System.out.println("ArrayList minimum value: " + getArrayListMin(arr));
			System.out.println("ArrayList average value: " + getArrayListAverage(arr));
			
			for(int x = 0; x < c; x++) {
				arr.remove(0);
			}
		}
		
	}
	
	public static void toStringArrayList(ArrayList<Integer> arr) {
		for(int x = 0; x < arr.size(); x++) {
			System.out.print(arr.get(x) + ", ");
			
		}
	}
	
	public static int getArrayListAverage(ArrayList<Integer> arr) {
		int c = 0;
		for(int x = 0; x < arr.size(); x++) {
			c += arr.get(x);
		}
		return (c/(arr.size() + 1));
	}
	
	public static int getArrayListMax(ArrayList<Integer> arr) {
		int c = 0;
		for(int x = 0; x < arr.size(); x++) {
			if (c < arr.get(x)) {
				c = arr.get(x);
			}
		}
		return c;
	}
	
	public static int getArrayListMin(ArrayList<Integer> arr) {
		int c = 101;
		for(int x = 0; x < arr.size(); x++) {
			if (c > arr.get(x)) {
				c = arr.get(x);
			}
		}
		return c;
	}
}
