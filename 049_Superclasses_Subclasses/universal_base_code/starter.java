import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer p1 = new Performer();
		Performer p2 = new Performer("taC ajoD", 62);
		Musician m1 = new Musician();
		Musician m2 = new Musician("olleC");
		
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
		
		
		
	}
}
