package pkg;
import java.util.Scanner;
import java.util.Random;


public class History extends Course {
	String Era;

	public History(String Teacher, int grade, String Era) {
		super(Teacher, grade);
		this.Era = Era; 
		
	}
	
	public void setEra(String Era) {
		this.Era = Era;
	}
	
	public String getEra() {
		return Era;
	}
	
	public String toString() {
		return ("Teacher: " + Teacher + "\nCredit: " + credit + "\nEra: " + Era);
	}

}

