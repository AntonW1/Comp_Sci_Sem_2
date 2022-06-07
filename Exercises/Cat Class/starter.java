import pkg.*;
import java.util.Scanner;
import java.util.Random;


class Cat {
	String name;
	public Cat() {
		name = "Garfield";
	}
	public Cat(String a) {
		name = a;
	}
	
	public void Meow() {
	System.out.println(name + ": Meow!");
	
	}	
}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		String x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a name: ");
		x = sc.nextLine();
		Cat cat1 = new Cat();
		Cat cat2 = new Cat(x);
		cat1.Meow();
		cat2.Meow();
		
	}
}


