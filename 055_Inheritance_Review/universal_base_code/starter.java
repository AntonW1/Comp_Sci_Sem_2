import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Course sci = new Science("a", 100, "Bio");
		Course apsci = new APSci("a", 100, "Bio");
		Course resci = new RecoverySci("c", 100, "Bio");
		Course math = new Mathe("d", 100, "Calculus BC");
		Course his = new History("e", 100, "2022");
		
		System.out.println(sci.toString());
		System.out.println(apsci.toString());
		System.out.println(resci.toString());
		System.out.println(math.toString());
		System.out.println(his.toString());
		
		System.out.println(sci.equals(apsci));
		System.out.println(sci.equals(resci));
	}
}
