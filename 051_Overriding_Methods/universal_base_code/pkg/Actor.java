package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
	String type;

	public Actor() {
		type = "theater";
		
	}
	
	public Actor(String name, String type) {
		super(name);
		this.type = type;
	}
	
	public void practice() {
		System.out.println(name + " reads their lines for practice.");
	} 
	
	public void perform() {
		System.out.println(name + " gives an outstanding performance!");
	}
	
	public void monologue() {
		System.out.println(name + ": " + "Did you ever hear the tragedy of Darth Plagueis The Wise?\nI thought not. It’s not a story the Jedi would tell you. It’s a Sith legend.\nDarth Plagueis was a Dark Lord of the Sith, so powerful and so wise he could use the Force to influence the midichlorians to create life...\nHe had such a knowledge of the dark side that he could even keep the ones he cared about from dying.\nThe dark side of the Force is a pathway to many abilities some consider to be unnatural.\nHe became so powerful... the only thing he was afraid of was losing his power, which eventually, of course, he did.\nUnfortunately, he taught his apprentice everything he knew, then his apprentice killed him in his sleep.\nIronic.\nHe could save others from death, but not himself.");
	}

}

