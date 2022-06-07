import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
		int [] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
		int [] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
		int mode1 = getMode(arr1);
		int mode2 = getMode(arr2);	
		int mode3 = getMode(arr3);	
		
		int [] arr4 = {1, 2, 3, 4, 5, 6, 7};
		int [] arr5 = {1, 2, 3, 4, 5, 6};
		
		int median1 = getMedian(arr4);
		int median2 = getMedian(arr5);
		
	}
	
	public static int getMode (int[] b) {
		int c = 0; // inside loop 
		int c1 = 0; // inside loop check if that index is the mode
		int c2 = 0; // count times
		int c3 = 0; // check highest
		int c4 = 0; // record highest index
		while(true) {
			while(true) {
				if (c == b.length()) {
					if (c2 > c3) {
						c3 = c2;
						c4 = c1;
					}
					c1++;
					break;
				}
				if (b[c1] == b[c]) {
					c2++;
				}
				c++; 
			}
			if (c1 == b.length()) {
				break;
			}
			
		}
		
		return c4;
		
	}
	public static int getMedian (int[] a) {
		if(a.length%2 == 0) {
			return a[a.length/2-1];
		}
		
		else {
		return a[a.length/2];
		}
	}
	
	

}
