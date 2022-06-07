import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 200);
		printValuesInt(arr1);
		insertionSort(arr1);			//Create this method
		System.out.println();
		printValuesInt(arr1);
		
		
		
	}
	
	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*10));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void insertionSort(ArrayList<Integer> arr) {
		for(int outer = 1; outer < arr.size(); outer++) {
			int key = arr.get(outer);
			int inner = outer - 1;
			
			while(inner >= 0 && arr.get(inner) > key) {
				arr.set(inner + 1, arr.get(inner));
				inner = inner - 1;
			}
			arr.set(inner + 1, key);
		}
	}
}
