package pkg;
import java.util.Scanner;
import java.util.Random;


public class Druid {
	String name;
	Random rand = new Random();
	int health = rand.nextInt(15 + 1);
	int attack = rand.nextInt(15 + 1);

	public Druid() {
		name = "";
	}
	
	public Druid(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getName() {
		return name;
	}
	
	public void attack(Warrior target) {
		target.setHealth(target.getHealth() - rand.nextInt(attack + 1));
	}
	public void attack(Wizard target) {
		target.setHealth(target.getHealth() - rand.nextInt(attack + 1));
	}
	
	public void printArt() {	
		System.out.println("        _--_             _                           ");
		System.out.println("     ^ /    \\ ^      ^  (o>                         ");
		System.out.println("    / | o  o | \\     \\\\_/_)                       ");
		System.out.println("    \\_|   ^  |_/      \\_/_)                        ");
		System.out.println("      | \\__  |        __|_                          ");
		System.out.println("       \\    /          {}                           ");
		System.out.println("       _|  |_          ||                            ");
		System.out.println("    _ /      \\ _____  /||                           ");
		System.out.println("   / |        |_____---<|                            ");
		System.out.println("   | |        |       \\||                           ");
		System.out.println("   |_|        |        ||                            ");
		System.out.println("     \\       /         ||                           ");
		System.out.println("     |       |         ||                            ");
		System.out.println("     /   ^   \\         \\/                          ");
		System.out.println("     |  | |  |                                       ");
		System.out.println("     |  | |  |                                       ");
		System.out.println("     |  | |  |                                       ");
		System.out.println("     \\  / \\  /                                     ");
		System.out.println("     |__>  |_>                                       ");
		
		
	}

}

