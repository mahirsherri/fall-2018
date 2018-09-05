package day6_operators_boolean;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
		/*
		 * Create a program that accepts value 
		 * in miles and converts to kilometers
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter miles:");
		
		double miles = input.nextDouble();
		double kms = miles * 1.609344;
		
		System.out.println("KMs value: " + kms);
		/*
		 * Write a program that asks user to enter current car odometer miles
		 * and previous car odometer miles. Also number of gallons that was put.
		 * price per gallon.
		 * 
		 * calculate MPG -> miles per gallon value.
		 * calculate total fuel expense.
		 * 
		 */
		System.out.println("Enter current Odometer value:");
		double currentOdometerValue = input.nextDouble();
		
		System.out.println("Enter previous Odometer value:");
		double previousOdometerValue = input.nextDouble();
		
		System.out.println("Enter gallons:");
		double gallons = input.nextDouble();
		
		System.out.println("Price per gallon:");
		double pricePerGallon = input.nextDouble();
		
		double mpg = (currentOdometerValue - previousOdometerValue) / gallons;
		
		System.out.println("MPG value: " + mpg);
		
		double totalCost = gallons * pricePerGallon;
		System.out.println("Your total cost is $" + totalCost );
			
	}
}
