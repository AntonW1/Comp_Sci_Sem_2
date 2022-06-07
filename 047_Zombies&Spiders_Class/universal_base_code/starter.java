import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int damage;
		Creature z = new Zombie("Zack");
		Creature s = new Spider("Charlotte");
		Role d = new Druid("Tree");
		
		System.out.println("This is " + d.getName());
		System.out.println("This is " + s.getName());
		System.out.println("This is " + z.getName());
		
		
		
		while(true) {
			
			if(!s.isDead()) {
				damage = d.attack();
				s.takeDamage(damage);
				System.out.println(d.getName() + " strikes for " + damage + " damage on " + s.getName() + ".");
			}
			
			else {
				break;	
			}
			
		}
		System.out.println(s.getName() + " is dead :(");
		
		while(true) {
			
			if(!z.isDead()) {
				damage = d.attack();
				z.takeDamage(damage);
				System.out.println(d.getName() + " strikes for " + damage + " damage on " + z.getName() + ".");
			}
			
			else {
				break;
			}
			
		}
		System.out.println(z.getName() + " is dead :(");
		
		
		
		
	}
}
