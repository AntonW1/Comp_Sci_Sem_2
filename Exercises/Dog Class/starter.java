import pkg.*;
import java.util.Scanner;
import java.util.Random;


class Dog {
	String name;
	int age;
	String breed;
	
	
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	
	public Dog(String a) {
		name = a;
		age = 1;
		breed = "dog dog";
	}
	
	public Dog(String a, String b) {
		name = a;
		breed = b;
		age = 1;
	}
	public Dog(String a, int b) {
		name = a;
		age = b;
		breed = "dog dog";
	}
	
	public void setName(String a) {
	name = a;
	}
	public void setAge(int a) {
	age = a;
	}
	public void setBreed(String a) {
	breed = a;
	}
	public String getName() {
	return name;
	}
	public int getAge() {
	return age;
	}
	public String getBreed() {
	return breed;
	}
	
	public boolean isSleeping() {
		Random rand = new Random();
		boolean sleeping;
		int s;
		s = rand.nextInt(2);
		if (s == 0) {
			sleeping = true;
			return sleeping;
		}
		else if (s == 1) {
			sleeping = false;
			return sleeping;
		}
		else {
			System.out.println("boolean random");
		}
		return false;
	}
	
	public void Bark() {
		System.out.println(name + ": Bark!");
	}
}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		String x1;
		String y1;
		boolean z;
		boolean z2;
		boolean bark;
		String placeholder;
		
		System.out.print("Please enter a name: ");
		x = sc.nextLine();
		Dog dog1 = new Dog(x);
		System.out.print("Please enter its age: ");
		y = sc.nextInt();
		placeholder = sc.nextLine();
		dog1.setAge(y);
		
		System.out.println("");
		
		System.out.print("Please enter another name: ");
		x1 = sc.nextLine();
		System.out.print("Please enter its breed: ");
		y1 = sc.nextLine();
		Dog dog2 = new Dog(x1, y1);
		
		bark = false;
		
		z = dog1.isSleeping();
		if (z) {
			System.out.println(x + " is sleeping right now.");
		}
		else if (!z) {
			dog1.Bark();
			bark = true;
		}
		
		z2 = dog2.isSleeping();
		if (z2) {
			
			if (bark) {
				dog2.Bark();
			}
		}
		else if (!z2) {
			if (bark) {
				dog2.Bark();
			}
		}
		
	
		
	}
}


