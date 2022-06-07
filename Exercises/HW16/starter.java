import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
	//  	                     HIERARCHY
	//  	                         
	//  	      _______________Clothing________________
	//  	     |                   |                   |
	//  	  Shirts               Pants               Socks
	//  	     |
	//	  DesignerShirts
		
		
		
		Clothing sh = new Shirts("plain blue shirt", 19.99, "Nike", "cotton");
		
		Clothing pa = new Pants("jeans", 34.99, "Levi's", 100);
		
		Socks so = new Socks("black socks", 4.99, "Under Armour", "mid calf");
		
		Clothing ds = new DesignerShirts("plain white shirt (with Supreme logo)", 9999.99, "Supreme", "silk", "Supreme");
		
		int quantity1;
		int quantity2;
		int quantity3;
		int quantity4;
		String blank;
		String yesNo1;
		String yesNo2;
		String yesNo3;
		String yesNo4;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many shirts would you like to purchase?: ");
		quantity1 = sc.nextInt();
		System.out.print("Would you like a discount?(y/n): ");
		blank = sc.nextLine();
		yesNo1 = sc.nextLine();
		if(yesNo1.equals("y")) {
			sh.discount();
		}
		sh.sellClothing(quantity1);
		
		System.out.println("");
		
		System.out.print("How many pants would you like to purchase?: ");
		quantity2 = sc.nextInt();
		System.out.print("Would you like a discount?(y/n): ");
		blank = sc.nextLine();
		yesNo2 = sc.nextLine();
		if(yesNo2.equals("y")) {
			pa.discount();
		}
		pa.sellClothing(quantity2);
		
		System.out.println("");
		
		so.Match();
		so.Mismatch();
		so.Mismatch();
		so.Match();
		
		System.out.println("");
		
		System.out.print("How many socks would you like to purchase?: ");
		quantity3 = sc.nextInt();
		System.out.print("Would you like a discount?(y/n): ");
		blank = sc.nextLine();
		yesNo3 = sc.nextLine();
		if(yesNo3.equals("y")) {
			so.discount();
		}
		so.sellClothing(quantity3);
		
		System.out.println("");
		
		System.out.print("How many designer shirts would you like to purchase?: ");
		quantity4 = sc.nextInt();
		System.out.print("Would you like a discount?(y/n): ");
		blank = sc.nextLine();
		yesNo4 = sc.nextLine();
		if(yesNo4.equals("y")) {
			ds.discount();
		}
		ds.sellClothing(quantity4);
		
		
	}
}
