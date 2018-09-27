package day19_loops02;

import java.util.Scanner;

public class GiveMe5Dollars {
	public static void main(String[] args) {
		/*
		 * Ask for 5 dollars
		 * and keep asking for 5 dollars until you get it.
		 * or User enters it
		 */
		Scanner input = new Scanner(System.in);
		int amount;
		int tries = 1;
		//it should give chance to give $5 max 3 times
		//if timed out, dont say thank you
		
		do {
			System.out.println("Give me 5 bucks");
			amount = input.nextInt();
		}while(amount != 5);
		
		System.out.println("Thank you for $5");
		
	}
}
