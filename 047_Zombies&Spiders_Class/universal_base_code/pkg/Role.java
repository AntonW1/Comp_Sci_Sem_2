package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Role {
	
	public void setHealth(int h);
	public int getHealth();
	public String getName();
	public void attack(Role t);
//	public void attack(Creature c);
	public int attack();
	public void setName(String a);
	public void printArt();
	
}



