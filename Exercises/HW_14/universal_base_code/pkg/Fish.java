package pkg;
import java.util.Scanner;
import java.util.Random;


public class Fish implements Pet {
	
	String name;
	int age;
	boolean isTrained;


	public Fish() {
		name = "Fishy";
		age = 0;
		isTrained = false;
		interact();
	}
	
	public Fish(String name) {
		this(name, 0, false);
	}
	
	public Fish(int age) {
		this("Fishy", age, false);
	}
	
	public Fish(boolean isTrained) {
		this("Fishy", 0, isTrained);
	}
	
	public Fish(String name, boolean isTrained) {
		this(name, 0, isTrained);
	}
	
	public Fish(String name, int age, boolean isTrained) {
		this.name = name;
		this.age = age;
		this.isTrained = isTrained;
		interact();
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setIsTrained(boolean isTrained) {
		this.isTrained = isTrained;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean getIsTrained() {
		return isTrained;
	}
	
	public void interact() {
		System.out.println(name + " bubbles at its owner!");
	}
	
	public void trick() {
		System.out.println(name + " swims around!");
	}
	
	

}



