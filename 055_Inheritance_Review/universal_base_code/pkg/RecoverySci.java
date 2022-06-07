package pkg;
import java.util.Scanner;
import java.util.Random;


public class RecoverySci extends Science {
	
	public RecoverySci(String teacher, int grade, String Field) {
		super(teacher, grade, Field);
		calcCredit();
		
	}
	
	public void calcCredit() {
		if (getGrade() > 60) {
			setCredit(4);
		}
		else {
			setCredit(0);
		}
	}

}

