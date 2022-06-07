//import pkg.*;
import java.util.*;
import java.util.ArrayList;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> arr = new ArrayList<Integer>();
		ArrayList <Integer> arr2 = new ArrayList<Integer>();
		ArrayList <Integer> arr3 = new ArrayList<Integer>();
		
		for(int x = 0; x < 100; x++) {
			int rand = (int)((Math.floor(Math.random() * 100))) + 1;
			arr.add(x, rand);
			arr2.add(x, rand);
			arr3.add(x, rand);
		}
		
		System.out.println("-----------------ORIGINAL (3 ARRAYLISTS)-----------------");
		
		for(int i = 0; i < 100; i++) {
		System.out.print(arr.get(i) + ", ");
		}
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("-----------------WITH INSERTION-----------------");
		
		for(int outer = 1; outer < arr.size(); outer++) {
			int key = arr.get(outer);
			int inner = outer - 1;
			
			while(inner >= 0 && arr.get(inner) > key) {
				arr.set(inner + 1, arr.get(inner));
				inner = inner - 1;
			}
			arr.set(inner + 1, key);
		}
		
		for(int i = 0; i < 100; i++){
		System.out.print(arr.get(i) + ", ");
		}
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("-----------------WITH SELECTION-----------------");
		
		int min_index;
		for(int outer = 0; outer < arr2.size(); outer++) {
			min_index = outer;
			for(int inner = (outer + 1); inner < arr2.size(); inner++) {
				if(arr2.get(inner) < arr2.get(min_index)) {
					min_index = inner;
				}
			}
			int temp = arr2.get(outer);
			arr2.set(outer, arr2.get(min_index));
			arr2.set(min_index, temp);
		}
		
		for(int i = 0; i < 100; i++){
		System.out.print(arr2.get(i) + ", ");
		}
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("-----------------WITH BUBBLE-----------------");
		
		for(int outer = 0; outer < (arr3.size() - 1); outer++) {
			for(int inner = 0; inner < (arr3.size() - outer - 1); inner++) {
				if(arr3.get(inner) > arr3.get(inner + 1)) {
					int temp = arr3.get(inner);
					arr3.set(inner, arr3.get(inner + 1));
					arr3.set(inner + 1, temp);
				}
			}
		}
		
		for(int i = 0; i < 100; i++){
		System.out.print(arr3.get(i) + ", ");
		}
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("The Median of the ArrayList is: " + ((arr3.get(49) + arr3.get(50))/2));
	}
	
}
