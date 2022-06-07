import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	//Precondition: A and B are presorted in ascending order. 
	//Sort A and B into C.
	public static void mergeSort3(int [] A, int [] B, int [] C){
		
		
		
		int[] D = new int[60];
		
		
		
	/*	int[] A5 = new[A.length];
		int[] B5 = new[B.length];
		int[] C5 = new[C.length];
		
		for (int c = 0; c < A.length; c++) {
			A5[c] = 
		} */
		
		
		int a = 0;
		int b = 0;
		int c = 0;
		int aa = 0;
		int bb = 0;
		int cc = 0;
		int e = 0;
		for(int d = 0; d <= 47; e++) {	
			
			
				if (A[a] <= B[b] && A[a] <= C[c] && aa == 0) {
					D[d] = A[a];
					System.out.println("1 a: " + a + "   b: " + b + "   c: " + c + "    d: " + d + "   A[a] " + A[a] + "   B[b] " + B[b] + "   C[c] " + C[c]);
					a++;
					d++;
					if (a > 15) {
						aa = 1;
						a = 15;
						A[a] = 1000;
					}
					
				}
			
			
			
				if (B[b] <= A[a] && B[b] <= C[c] && bb == 0) {
					D[d] = B[b]; 
					System.out.println("2 a: " + a + "   b: " + b + "   c: " + c + "    d: " + d + "   A[a] " + A[a] + "   B[b] " + B[b] + "   C[c] " + C[c]);
					b++;
					d++;
					if (b > 15) {
						bb = 1;
						b = 15;
						B[b] = 1000;
					}
					
				}
		
			
				if (C[c] <= B[b] && C[c] <= A[a] && cc == 0) {
					D[d] = C[c];
					System.out.println("3 a: " + a + "   b: " + b + "   c: " + c + "    d: " + d + "   A[a] " + A[a] + "   B[b] " + B[b] + "   C[c] " + C[c]);
					c++;
					d++;
					if (c > 15) {
						cc = 1;
						c = 15;
						C[c] = 1000;
					}
					
				}
			
			
		}
		
		for(int i = 0; i < 48; i++) {
			System.out.print((D[i]) + ", ");
		}
		System.out.println("");
		System.out.println("");
		
		
		
	} 

	//A is the full array unsorted. 
	//First is the beginning index of the array A, last is the last index of the array.
	//Split A in two halves and sort independently. Then merge back into A.
	public static int[] mergeSort(int [] A, int first, int last){
		int middle = (last - first)/2;
		
		for(int outer = first; outer < middle; outer++) {
			for(int inner = first; inner < (middle - outer); inner++) {
				if(A[inner] > A[inner + 1]) {
					int temp = A[inner];
					A[inner] = A[inner + 1];
					A[inner + 1] = temp;
				}
			}
		}
		
		for(int outer = middle + 1; outer <= last; outer++) {
			for(int inner = middle + 1; inner <= (last - 1); inner++) {
				if(A[inner] > A[inner + 1]) {
					int temp = A[inner];
					A[inner] = A[inner + 1];
					A[inner + 1] = temp;
				}
			}
		}
		
		for(int i = 0; i <= last; i++){
		System.out.print((A[i]) + ", ");
		}
		System.out.println("");
		System.out.println("");
		
		int i = 0;
		int k = middle + 1;
		int[] A4 = new int[last + 1];
		int c = 0;
		
		while(true) {
			
		//	if((i + k) > (last + middle + 1)) {
		//		break;
		//	}
			if (c >= (last + 1)) {
				break;
			}
			
			if((k < (last + 1)) && (i <= (middle)) && (A[i] < A[k])) {
	//			System.out.println("1c: " + c + "   i: " + i + "   k: " + k);
				A4[c] = A[i];
				i++;
				c++;
	//			for(int j = 0; j <= last; j++){
	//		System.out.print((A4[j]) + ", ");
	//		}
	//		System.out.println("");
	//		System.out.println("");	
			}
			if((k < (last + 1)) && (i <= (middle)) && (A[k] <= A[i])) {
	//			System.out.println("2c: " + c + "   i: " + i + "   k: " + k);
				A4[c] = A[k];
				k++;
				c++;
	//			for(int j = 0; j <= last; j++){
	//		System.out.print((A4[j]) + ", ");
	//		}
	//		System.out.println("");
	//		System.out.println("");	
			}
			if((k == (last + 1)) && (i < (middle + 1))) {
	//			System.out.println("3c: " + c + "   i: " + i + "   k: " + k);
				A4[c] = A[i];
				i++;
				c++;
	//			for(int j = 0; j <= last; j++){
	//		System.out.print((A4[j]) + ", ");
	//		}
	//		System.out.println("");
	//		System.out.println("");	
			}
			if((i == (middle + 1)) && (k < (last + 1))) {
	//			System.out.println("4c: " + c + "   i: " + i + "   k: " + k);
				A4[c] = A[k];
				k++;
				c++;
	//			for(int j = 0; j <= last; j++){
	//		System.out.print((A4[j]) + ", ");
	//		}
	//		System.out.println("");
	//		System.out.println("");	
			}
		//	System.out.println("4c: " + c + "   i: " + i + "   k: " + k + "  A[k]: " + A[k] + "   A[i]: " + A[i]);
			
		}
		
		for(int j = 0; j <= last; j++){
		System.out.print((A4[j]) + ", ");
		}
		System.out.println("");
		System.out.println("");
		
		return A4;
		

		
/*		int[] A2 = new int[last + 1];
		
		for(int c = 0; c <= middle; c++) {
			A2[2 * c] = A[c];
			A2[2 * c + 1] = A [middle + c + 1];
		}
	*/	
	/*	int[] A3 = new int[last + 1];
		int i1 = 0;
		int k = 0;
		while(true) {
			if (A3)
		}
		
		for(int i = 0; i <= last; i++){
		System.out.print((A2[i]) + ", ");
		}
		System.out.println("");
		System.out.println(""); */
	}
	
	public static void main(String args[]) {
		int[] A = {16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] B = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 16, 15, 14, 13, 12, 11};
		int[] C = {37, 24, 11, 17, 31, 19, 29, 0, 18, 1, 27, 5, 15, 4, 36, 25};
		
		int[] O = mergeSort(A, 0, 15);
		
	    for(int j = 0; j < O.length; j++){
		System.out.print((O[j]) + ", ");
		}
		System.out.println("");
		System.out.println("");
	    
	    
		mergeSort3(mergeSort(A, 0, 15), mergeSort(B, 0, 15), mergeSort(C, 0, 15));
		
	}
}
