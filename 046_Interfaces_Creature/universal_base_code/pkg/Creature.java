package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Creature {
	
	public boolean isDead();
	public boolean takeDamage(int );
	public String getName();
	public void attack(Role);
	public void magicHeal();

}

