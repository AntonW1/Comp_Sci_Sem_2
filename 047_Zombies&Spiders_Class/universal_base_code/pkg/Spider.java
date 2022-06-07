package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spider implements Creature {
	Random rand = new Random();
	String name;
	int health = rand.nextInt(15 + 1);
	int attack = rand.nextInt(15 + 1);
	boolean isDead;

	public Spider() {
		name = "";
		isDead = false;
	}
	
	public Spider(String name) {
		this.name = name;
		isDead = false;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean takeDamage(int a) {
		health = health - a;
		return isDead();
	}
	
	public boolean isDead() {
		if(health <= 0) {
			isDead = true;
		}
		else if(health > 0) {
			isDead = false;
		}
		return isDead;
	}
	
	public void attack(Role target) {
		target.setHealth(target.getHealth() - rand.nextInt(attack + 1));
	}
	
	public int getHealth() {
		return health;
	}
	
	public void magicHeal() {
		health = health + rand.nextInt(15) + 1;
	}
	


}

