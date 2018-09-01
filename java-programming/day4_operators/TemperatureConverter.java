package day4_operators;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value in Fahrenheit");
		double fahrenheit = scan.nextDouble();
		
		double celcius = (5.0 / 9) * (fahrenheit - 32);
		
		System.out.println("Temperature in Celcius: " + (int)celcius);
	}
	
}
