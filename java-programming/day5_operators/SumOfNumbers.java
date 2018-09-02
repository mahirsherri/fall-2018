package day5_operators;
import java.util.Scanner;
public class SumOfNumbers {
	public static void main(String[] args) {
		/* Warm up task 1:
		 * Write a program that asks user to enter 3 numbers from keyboard
		 * and calculates the sum of those numbers then show result
		 */
		//Create a scanner
		Scanner input = new Scanner(System.in); 
		
		//ask user to enter 3 nums
		System.out.println("Enter 3 numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println("Sum is " + sum);
		
		input.close();
		
	}
	
}
