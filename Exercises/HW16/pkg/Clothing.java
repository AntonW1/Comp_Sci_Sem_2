package pkg;
import java.util.Scanner;
import java.util.Random;


public class Clothing {
	String name;
	double price;
	String clothingProducer;
	
	public Clothing() {
		name = "";
		price = 0.00;
		clothingProducer = "";
		
	}
	
	public Clothing(String name, double price, String clothingProducer) {
		this.name = name;
		this.price = price;
		this.clothingProducer = clothingProducer;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void discount() {
		price = price * 0.8;
		System.out.println(name + " is 20% off!");
	}
	
	public void setClothingProducer(String clothingProducer) {
		this.clothingProducer = clothingProducer;
	}
	
	public String getClothingProducer() {
		return clothingProducer;
	}
	
	public void sellClothing(int quantity) {
		if (quantity == 1) {
			System.out.println("A " + name + " has been purchased for " + price + ".");
		}
		else {
		System.out.println(quantity + " " + name + " have been purchased for " + price * quantity + ".");
		}
	}
}
