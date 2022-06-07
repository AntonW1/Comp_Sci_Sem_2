import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void main(String args[]) {
		// Your code goes below here
		// BaseClass test = new BaseClass();
		
		Pet[] myArray = new Pet[10];
		myArray[0] = new Bird();						
		myArray[1] = new Bird(36);				
		myArray[2] = new Bird(true);					
		myArray[3] = new Bird("Phoenix");					
		myArray[4] = new Bird("Red", true);	
		myArray[5] = new Bird("Professor Pericles", 50, false);	
		
		myArray[6] = new Fish("Shark", 100, true);	
		myArray[7] = new Fish("Blue", true);	
		myArray[8] = new Fish();	
		myArray[9] = new Fish("Whale");	
		
		System.out.println();
		myArray[0].trick();							
		myArray[1].trick();			
		myArray[2].trick();			
		myArray[3].trick();			
		myArray[4].trick();			
		myArray[5].trick();			
		myArray[6].trick();			
		myArray[7].trick();			
		myArray[8].trick();			
		myArray[9].trick();			

		
		
	}
}
