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
		selectionSort(arr1);			//Create this method
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
	
	
	public static void selectionSort(ArrayList<Integer> arr) {
		
		int min_index;
		for(int outer = 0; outer < arr.size(); outer++) {
			min_index = outer;
			for(int inner = (outer + 1); inner < arr.size(); inner++) {
				if(arr.get(inner) < arr.get(min_index)) {
					min_index = inner;
				}
			}
			int temp = arr.get(outer);
			arr.set(outer, arr.get(min_index));
			arr.set(min_index, temp);
		}
		
	}
}
