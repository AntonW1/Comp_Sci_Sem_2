import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Performer p1 = new Performer();
		Performer p2 = new Performer("Lil Nax X", 22);
		Musician m1 = new Musician();
		Musician m2 = new Musician("trumpet");
		
		System.out.println("Introducing performer 1, " + p1.getName() + "!");
		p1.practice();
		
		System.out.println("");
		
		System.out.println("Welcome performer 2, " + p2.getName() + "!");
		p2.perform();
		
		System.out.println("");
		
		System.out.println("Get ready for musician 1, " + m1.getName() + "!");
		m1.perform();
		m1.playInstrument();
		
		System.out.println("");
		
		m2.practice();
		System.out.println("Musician 2's instrument is " + m2.getInstrument());
		
	// -------------------------------------------------------------------------------------------	
		System.out.println("");
		
		System.out.println("-------------------New Musicians-------------------");
		Musician m3 = new Musician("Dwayne Johnson", "Coconuts");
		System.out.println("Introducing musician 3, " + m3.getName() + "!");
		m3.practice();
		System.out.println("Musician 3's instrument is " + m3.getInstrument() + ".");
		
		System.out.println("");
		
		Musician m4 = new Musician("Elvis Presley", 87, "guitar");
		System.out.println("Welcome musician 2, " + m4.getName() + "!");
		m4.perform();
		m4.playInstrument();
		
		
		
	}
}
