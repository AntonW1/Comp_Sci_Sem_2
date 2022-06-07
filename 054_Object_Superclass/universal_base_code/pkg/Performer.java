package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer {
	String name;
	int age;

	public Performer() {
		name = "Doja Cat";
		age = 26;
		
	}
	
	public Performer(String name) {
		this.name = name;
		age = 26;
	}
	
	public Performer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void practice() {
		System.out.println(name + " is practicing.");
	}
	
	public void perform() {
		System.out.println(name + " is performing.");
	}
	
	public String toString() {
		return (name + " is " + age + " years old.");
	}
	
	public boolean equals(Performer other) {
		if (!(other instanceof Performer)) {
			return false;
		}
		else {
			return (this.name == other.name);
		}
	}
	

}

