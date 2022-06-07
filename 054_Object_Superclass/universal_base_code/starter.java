import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
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
		
		System.out.println("");
		
		System.out.println("-------------------Actor-------------------");
		
		Actor a1 = new Actor("Ian McDiarmid", "Movie");
		a1.practice();
		a1.perform();
		a1.monologue();
		
		System.out.println("");
		
		System.out.println("-------------------Apprentice-------------------");
		
		Apprentice ap1 = new Apprentice();
		Apprentice ap2 = new Apprentice("Stanford", 4);
		Apprentice ap3 = new Apprentice("guitar", "UCLA", 6);
		Apprentice ap4 = new Apprentice("Will Ferrell", 54, "triangle", "USC", 8);
		
		ap1.playInstrument();
		System.out.println("");
		ap2.practice();
		System.out.println("");
		ap3.perform();
		System.out.println("");
		ap4.practiceAtUniversity();
		
		System.out.println("");
		
		System.out.println("-------------------Polymorphism Lab-------------------");
		
		System.out.println("");
		
	//	Performer p3 = new Performer("Performer");
	//	Musician m5 = new Musician("Musician", "Cello");
	//	Apprentice ap5 = new Apprentice("Apprentice", 22, "Viola", "University of Washington", 4);
	//	Actor a2 = new Actor("Actor");
		
		Performer[] fourPerformers = new Performer[4];
		
		Performer p3 = new Performer("Performer");
		Musician m5 = new Musician("Musician", "Cello");
		Apprentice ap5 = new Apprentice("Apprentice", 22, "Viola", "University of Washington", 4);
		Actor a2 = new Actor("Actor");
		
		fourPerformers[0] = p3;
		fourPerformers[1] = m5;
		fourPerformers[2] = ap5;
		fourPerformers[3] = a2;
		
		fourPerformers[0].perform();
		fourPerformers[0].practice();
		
		System.out.println("");
		
		fourPerformers[1].perform();
		((Performer)fourPerformers[1]).practice(); //performer
		
		System.out.println("");
		
		((Apprentice)fourPerformers[2]).practiceAtUniversity();
		((Musician)fourPerformers[2]).playInstrument(); //musician
		
		System.out.println("");
		
		((Actor)fourPerformers[3]).monologue();
		((Performer)fourPerformers[3]).perform(); //performer
		
		System.out.println("-------------------Object Superclass-------------------");
		
		System.out.println(fourPerformers[0].toString());
		System.out.println(fourPerformers[1].toString());
		System.out.println(fourPerformers[2].toString());
		System.out.println(fourPerformers[3].toString());
		
		System.out.println("Check the names of the performer and the musician.");
		
		if(fourPerformers[0].equals(fourPerformers[1])) {
			System.out.println("They have the same name.");
		}
		else {
			System.out.println("They have different names.");
		}
		
		
	}
}
