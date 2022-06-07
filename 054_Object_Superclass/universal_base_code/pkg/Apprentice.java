package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician {
	String school = "";
	int yearsOfExperience = 0;

	public Apprentice() {
		
		school = "CVHS";
		yearsOfExperience = 0;
		
	}
	
	public Apprentice(String school, int yearsOfExperience) {
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public Apprentice(String instrument, String school, int yearsOfExperience) {
		super(instrument);
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience) {
		super(name, age, instrument);
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void playInstrument() {
		System.out.println(name + " is trying to play the " + instrument + ".");
	}
	
	public void practice() {
		super.practice();
		System.out.println(name + " has played for " + yearsOfExperience + " years.");
	}
	
	public void perform() {
		super.perform();
		System.out.println("The performance still needs some work.");
	}
	
	public void practiceAtUniversity() {
		super.practice();
		System.out.println(name + " is practicing at " + school + ".");
	}
	
	public String toString() {
		return (name + " plays the " + instrument + " at " + school + ".");
	}

}

