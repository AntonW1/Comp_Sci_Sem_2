import java.util.*;

class starter {
	//Methods go here
	
	public static void printArrayList(ArrayList <Integer> arr) {
		for(int x = 0; x < arr.size(); x++) {
			System.out.println("Index: " + x + " Value: " + arr.get(x));
		}
	}
	
	public static void addValuesArrayList(int n, ArrayList <Integer> arr) {
		for(int x = 0; x < n; x++) {
			arr.add((int)Math.floor(Math.random() * 99.0) + 1);
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> arr = new ArrayList<Integer>();
		int n;
		System.out.print("How many values do you want to add to the ArrayList?: ");
		n = sc.nextInt();
		
		addValuesArrayList(n, arr);
		printArrayList(arr);
		
		
		
	}
}
