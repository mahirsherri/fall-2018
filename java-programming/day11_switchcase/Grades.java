package day11_switchcase;

import java.util.Scanner;

public class Grades {
	/*
	 * A -> Excellent
	 * B -> Good
	 * C -> Acceptable
	 * D -> Poor
	 * Anything else -> ERROR: invalid grade
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Grade:");
		char grade = scan.next().charAt(0); // get a Char from a Scanner
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Acceptable");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		default:
			System.out.println("ERROR: Invalid Grade");
			//break; it is optional as defaul already at the bottom
		}
	}
	
}










