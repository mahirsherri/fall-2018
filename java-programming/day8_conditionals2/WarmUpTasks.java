package day8_conditionals2;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
		/*
		 *1. Write a program that asks a student what is their Batch number.
		 * if that is 10, say - we are classmates!
		 * if not , say something else
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi, What is your batch number?");
		
		int batch = scanner.nextInt();
		if(batch == 10) {
			System.out.println("We are classmates!");
		}else {
			System.out.println("Nice to meet you anyways.");
		}
				
		/*
		 *2. Create a variable pincode and assign some number
		 * Ask user to enter their pincode, if it matches, say access granted
		 * if not, denied
		 */
		int pincode = 1234;
		System.out.println("Enter your pincode");
		int inputPincode = scanner.nextInt();
		
		if(inputPincode == pincode) {
			System.out.println("Access Granted, Welcome");
		}else {
			System.out.println("Access Denied");
			System.out.println("Incorrect pincode");
		}
		
		
	
		/*
		 *3. Ask user to enter a number. and check if it is odd or even.
		 If even print "It is even number. else print it is odd number
		 */
		System.out.println("Enter any number");
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
		
		
		
	}
}
