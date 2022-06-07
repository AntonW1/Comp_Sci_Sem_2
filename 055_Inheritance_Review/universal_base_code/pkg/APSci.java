package pkg;
import java.util.Scanner;
import java.util.Random;


public class APSci extends Science {

	public APSci(String teacher, int grade, String Field) {
		super(teacher, grade, Field);
		calcCredit();
		
	}
	
	public void calcCredit() {
		
		setCredit((super.getCredit()) + 1);
	}

}

