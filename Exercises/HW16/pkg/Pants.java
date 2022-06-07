package pkg;
import java.util.Scanner;
import java.util.Random;


public class Pants extends Clothing {
	int length;
	
	public Pants() {
		length = 0;
		
	}
	
	public Pants(String name, double price, String clothingProducer, int length) {
		super(name, price, clothingProducer);
		this.length = length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
}