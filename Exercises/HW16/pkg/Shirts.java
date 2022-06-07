package pkg;
import java.util.Scanner;
import java.util.Random;


public class Shirts extends Clothing {
	String material;
	
	public Shirts() {
		material = "";
		
	}
	
	public Shirts(String name, double price, String clothingProducer, String material) {
		super(name, price, clothingProducer);
		this.material = material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getMaterial() {
		return material;
	}






























}
