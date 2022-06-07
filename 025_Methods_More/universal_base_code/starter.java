import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		String name;
		String title;
		String choice;
		int points;
		String a;
		int b;
		int c;
		int d;
		int e;
		int f;
		
		String placeholder;
		
		Scanner sc = new Scanner(System.in);
		
		myCharacter Ant = new myCharacter();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		a = sc.nextLine();
		Ant.setRole(a);
		
		System.out.println("");
		System.out.println("You have 25 skill points. You may use a maximum of 10 points in each catagory (Strength, Dexterity, Intelligence, Constitution, and Charisma)");
		System.out.println("");
		
		System.out.print("Strength (1-10): ");
		b = sc.nextInt();
		placeholder = sc.nextLine();
		Ant.setStrength(b);
		
		System.out.println("");
		
		System.out.print("Dexterity (1-10): ");
		c = sc.nextInt();
		placeholder = sc.nextLine();
		Ant.setDexterity(c);
		
		System.out.println("");
		
		System.out.print("Intelligence (1-10): ");
		d = sc.nextInt();
		placeholder = sc.nextLine();
		Ant.setIntelligence(d);
		
		System.out.println("");
		
		System.out.print("Constitution (1-10): ");
		e = sc.nextInt();
		placeholder = sc.nextLine();
		Ant.setConstitution(e);
		
		System.out.println("");
		
		System.out.print("Charisma (1-10): ");
		f = sc.nextInt();
		placeholder = sc.nextLine();
		Ant.setCharisma(f);
		
		System.out.println("");
		
		Ant.setAll (a, b, c, d, e, f);
		
		Ant.myToString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	else
		{
			System.out.println("");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("You are " + name + " " + title);
			System.out.println("You're a " + choice + " with the following stats!");
			System.out.println("Strength - " + strength);
			System.out.println("Dexterity - " + dexterity);
			System.out.println("Intelligence - " + intelligence);
			System.out.println("Constitution - " + constitution);
			System.out.println("Charisma - " + charisma);
			System.out.println("");
			System.out.println("Good luck on your adventure " + name + "!");
			
			break;
		}
	
	*/
		
		
		
		
	}
}
