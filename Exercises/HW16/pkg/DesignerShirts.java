package pkg;
import java.util.Scanner;
import java.util.Random;


public class DesignerShirts extends Shirts {
	String brand;
	
	public DesignerShirts() {
		brand = "";
		
	}
	
	public DesignerShirts(String name, double price, String clothingProducer, String material, String brand) {
		super(name, price, clothingProducer, material);
		this.brand = brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void discount() {
		price = price * 2;
		System.out.println("No discounts on designer shirts! The price of " + name + " has been doubled!");
	}
	
	public void sellClothing(int quantity) {
		if (quantity > 0) {
			System.out.println("Sale unsuccessful. A " + name + " is too expensive for the customer.");
		}
	}
}