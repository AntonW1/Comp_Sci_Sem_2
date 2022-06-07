import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
//		BaseClass test = new BaseClass();
		Wizard[] Gandalf = new Wizard[100];
		Warrior[] Gimli = new Warrior[100];
		int cWiz = 0;
		int cWar = 0;
		
		int c = 0;
		while(true) {
			if (c == 100) {
				break;
			}
			Gandalf[c] = new Wizard();
			Gimli[c] = new Warrior();
			c++;
		}
		
		while(true) {
			Gandalf[cWiz].attack (Gimli[cWar]);
			if (Gimli[cWar].isDead()) {
				if(Gimli[99].isDead()) {
					System.out.println("Wizards win with " + (100 - cWiz)+ " left in their army");
					break;
				}
				cWar++;
			}
			
			Gimli[cWar].attack (Gandalf[cWiz]);
			if (Gandalf[cWiz].isDead()) {
					if(Gandalf[99].isDead()) {
						System.out.println("Warriors win with " + (100 - cWar) + " left in their army");
						break;
					}
				cWiz++;
			}
			
		}
		
		

		
	}
}
