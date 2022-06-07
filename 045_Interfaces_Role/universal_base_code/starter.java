import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void main(String args[]) {
		// Your code goes below here
		// BaseClass test = new BaseClass();
		
		Role[] A = new Role[3];
		A[0] = new Druid();
		A[1] = new Wizard();
		A[2] = new Warrior();
		A[0].setName("Tree");
		System.out.println("This is " + A[0].getName());
		A[0].printArt();
		System.out.println("");
		System.out.println("This is " + A[1].getName());
		A[1].printArt();
		System.out.println("");
		System.out.println("This is " + A[2].getName());
		A[2].printArt();
		
	}
}
