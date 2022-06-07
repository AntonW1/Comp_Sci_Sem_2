//import pkg.*;
import java.util.*;
import java.util.ArrayList;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void removeDup(ArrayList<Integer> arr) {
		for(int i = 0; i < arr.size(); i++){
			for(int i2 = i + 1; i < arr.size(); i++){
				if(arr.get(i) == arr.get(i2)) {
					arr.remove(i2);
					i--;
				}
			}
		}
	}
}
