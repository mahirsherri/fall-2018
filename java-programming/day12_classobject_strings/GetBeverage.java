package day12_classobject_strings;

import java.util.Scanner;

public class GetBeverage {
	public static void main(String[] args) {
		/* tea -> $3
		 * coffee -> $4
		 * water -> $2
		 * juice -> $5
		 * 
		 * String drink;
		 * double price; 
		 */
		//switch statement. Your total is price
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your drink:");
		String drink = scan.next();
		
		double price = 0.0;
		// Water not equal to water
		switch(drink) {
			case "tea":
				price = 3.0;
				break;
			case "coffee":
				price = 4.0;
				break;
			case "water":
				price = 2.0;
				break;
			case "juice":
				price = 5.0;
				break;
			default:
				System.out.println("Invalid drink");
				return; // go out from whole main method
		}
		
		System.out.println("You total is $" + price);

	}
}
