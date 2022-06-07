package pkg;
import java.util.Scanner;
import java.util.Random;


public class Bird implements Pet {
	String name;
	int age;
	boolean isTrained;


	public Bird() {
		name = "Birdy";
		age = 0;
		isTrained = false;
		interact();
	}
	
	public Bird(String name) {
		this(name, 0, false);
	}
	
	public Bird(int age) {
		this("Birdy", age, false);
	}
	
	public Bird(boolean isTrained) {
		this("Birdy", 0, isTrained);
	}
	
	public Bird(String name, boolean isTrained) {
		this(name, 0, isTrained);
	}
	
	public Bird(String name, int age, boolean isTrained) {
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
		System.out.println(name + " chirps at its owner!");
	}
	
	public void trick() {
		System.out.println(name + " flies through a hoop!");
	}

}



