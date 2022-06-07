import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Warrior Gimli = new Warrior();
		Wizard Gandalf = new Wizard();
		Druid a = new Druid("Tree");
		System.out.println("This is " + a.getName());
		a.printArt();
		System.out.println("");
		System.out.println("This is " + Gandalf.getName());
		Gandalf.printArt();
		System.out.println("");
		System.out.println("This is " + Gimli.getName());
		Gimli.printArt();
		
		
		
		
		
		
		
	}
}
