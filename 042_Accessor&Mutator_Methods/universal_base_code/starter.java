import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		
		Dwarf[] Dwarves = new Dwarf[100];
		int c = 0;
		int randNum = 0;
		int duplicates = 0;
		
		while(true) {
			if (c == 100) {
				break;
			}
			Dwarves[c] = new Dwarf();
			c++;
		}
		c = 0;
		while(true) {
			if (c == 100) {
				break;
			}
			randNum = rand.nextInt(7);
			if (randNum == 0) {
				Dwarves[c].setName("Grumpy");
			}
			if (randNum == 1) {
				Dwarves[c].setName("Dopey");
			}
			if (randNum == 2) {
				Dwarves[c].setName("Doc");
			}
			if (randNum == 3) {
				Dwarves[c].setName("Happy");
			}
			if (randNum == 4) { 
				Dwarves[c].setName("Bashful");
			}	
			if (randNum == 5) {
				Dwarves[c].setName("Sneezy");
			}
			if (randNum == 6) {
				Dwarves[c].setName("Sleepy");
			}
			randNum = rand.nextInt(100);
			Dwarves[c].setAge(randNum + 1);
			c++;
		}
		
		c = 0;
		while(true) {
			if (c == 100) {
				break;
			}
			System.out.println(c + 1 + ". Name: " + Dwarves[c].getName() + " Age: " + Dwarves[c].getAge()); 
			c++;
		}
		
	}
}
class Dwarf {
	String name;
	int age;
	
	Dwarf () {
		name = "";
		age = 0;
	}
	
	public void setName (String a) {
		name = a;
	}
	
	public void setAge (int a) {
		age = a;
	}
	
	public String getName () {
		return name;
	}
	
	public int getAge () {
		return age;
	}
	
}
