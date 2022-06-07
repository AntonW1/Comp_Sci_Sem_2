package pkg;
import java.util.Scanner;
import java.util.Random;


public class Mathe extends Course {
	String Difficulty;

	public Mathe(String Teacher, int grade, String Difficulty) {
		super(Teacher, grade);
		this.Difficulty = Difficulty; 
		
	}
	
	public void setDifficulty(String Difficulty) {
		this.Difficulty = Difficulty;
	}
	
	public String getDifficulty() {
		return Difficulty;
	}
	
	public String toString() {
		return ("Teacher: " + Teacher + "\nCredit: " + credit + "\nDifficulty: " + Difficulty);
	}

}

