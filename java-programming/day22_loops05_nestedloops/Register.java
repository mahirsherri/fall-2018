package day22_loops05_nestedloops;

import java.util.Scanner;
/*
 * MAC: COMMAND+SHIFT+O is used for automatic import
 * WINDOWS: CTRL+SHIFT+O is used for automatic import
 * INDENTATION:
 * 	Select lines of code: TAB
 * 	IF you want to remove a tab: Select lines of code > SHIFT+TAB
 */
public class Register {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("----WELCOME TO OUR STORE---- :) \n");
		
		System.out.println("How many items you have?");
		int itemsCount = input.nextInt();
		
		//declare variables for all items and price for them
		String allItems = "";
		double totalPrice = 0;
		
		for(int i = 1; i <= itemsCount; i++) {
			System.out.println("What is item "+i+"?");
			String item = input.next();
			
			System.out.println("How much is "+ item +"?");
			double price = input.nextDouble();
			
			if(i == itemsCount) {
				allItems = allItems + item;
			}else {
				allItems = allItems + item + ",";
			}
			
			totalPrice = totalPrice + price;
		}
		
		System.out.println("Your items: "+allItems);
		System.out.println("Total price: $" + totalPrice);
		
		
		
		
	}
}
