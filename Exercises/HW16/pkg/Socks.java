package pkg;
import java.util.Scanner;
import java.util.Random;


public class Socks extends Clothing {
	String type;
	boolean pair;
	
	public Socks() {
		type = "";
		pair = true;
		
	}
	
	public Socks(String name, double price, String clothingProducer, String type) {
		super(name, price, clothingProducer);
		this.type = type;
		pair = true;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void Mismatch() {
		if (!pair) {
			System.out.println("The socks are already mismatched.");
		}
		else {
			pair = false;
			System.out.println("The socks have been mismatched.");
		}
	}
	
	public void Match() {
		if (pair) {
			System.out.println("The socks are already matched.");
		}
		else {
			pair = true;
			System.out.println("The socks have been matched.");
		}
	}
}
