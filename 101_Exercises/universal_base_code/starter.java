import pkg.*;
import java.util.Scanner;
import java.util.Random;



class starter {
	public static void main(String args[]) {
		// Your code goes below here
//		BaseClass test = new BaseClass();
		String x;
		String x2;
		String x3;
		String y;
		String y2;
		String y3;
		int z;
		int z2;
		String a;
		String originalArtwork;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What type of artwork will you make first? (Human, Dog, Cactus): ");
		x = sc.nextLine();
		Ascii myAscii1 = new Ascii(x);
		System.out.println("It's name will be Bob.");
		
		System.out.print("What type of artwork will you make second? (Human, Dog, Cactus): ");
		x2 = sc.nextLine();
		System.out.print("What would you like to name it?: ");
		y = sc.nextLine();
		Ascii myAscii2 = new Ascii(x, y);
		
		System.out.print("What type of artwork will you make third? (Human, Dog, Cactus): ");
		x3 = sc.nextLine();
		System.out.print("What would you like to name it?: ");
		y2 = sc.nextLine();
		System.out.print("How many times do you want to print " + y2 + "?: ");
		z = sc.nextInt();
		a = sc.nextLine();
		Ascii myAscii3 = new Ascii(x3, y2, z);
		
		Ascii myAscii4 = new Ascii();
		System.out.println("The next artwork will have type: Other.");
		myAscii4.setType("Other");
		System.out.print("What would you like to name it?: ");
		y3 = sc.nextLine();
		myAscii4.setName(y3);
		System.out.print("How many times do you want to print " + y3 + "?: ");
		z2 = sc.nextInt();
		a = sc.nextLine();
		myAscii4.setNumber(z2);
		System.out.print("Create your own Ascii artwork!: ");
		originalArtwork = sc.nextLine();
		myAscii4.setAscii(originalArtwork);
		
		myAscii1.printArt();
		myAscii2.printArt();
		myAscii3.printArt();
		myAscii4.printArt();
		
		
		
		
		
		
	}

}




