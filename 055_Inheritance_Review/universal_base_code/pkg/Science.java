package pkg;
import java.util.Scanner;
import java.util.Random;


public class Science extends Course {
	String Field;

	public Science(String Teacher, int grade, String Field) {
		super(Teacher, grade);
		this.Field = Field; 
		
	}
	
	public void setField(String Field) {
		this.Field = Field;
	}
	
	public String getField() {
		return Field;
	}
	
	public String toString() {
		return ("Teacher: " + Teacher + "\nCredit: " + credit + "\nField: " + Field);
	}

}

