package day5_operators;

import java.util.Scanner;

public class CoinsCalculator {
	public static void main(String[] args) {
//		int pennies = 250;
//		int dollars = pennies / 100;
//		System.out.println(dollars);
//		pennies %= 100; //50
//		System.out.println(pennies);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter count of pennies you have:");
		int pennies = keyboard.nextInt();//333
		int dollars, quarters, dimes, nickels, cents;
		
		dollars = pennies / 100;
		pennies %= 100;//33
		
		quarters = pennies/25; // 33 / 25 -> 1
		pennies %= 25; //33 / 25 -> 8
		
		dimes = pennies / 10; // 8 / 10 -> 0
		pennies %= 10; //8 % 10 -> 8
		
		nickels = pennies / 5; //8/5 -> 1
		pennies %= 5; //8 % 5 -> 3
		
		cents = pennies;
		
		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Cents: " + cents);
		
	}
}






