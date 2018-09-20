package day_15_string_manipulation_review;

import java.util.Scanner;

public class MiddleOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word");
		String entry = scanner.nextLine();

		// check if the word has odd number of characters
		boolean isOdd = entry.length() % 2 == 1;

		System.out.println("isOdd: " + isOdd);

		boolean has3ormore = entry.length() >= 3;

		System.out.println("has 3 or more: " + has3ormore);

		if (isOdd && has3ormore) {
			// print the character in the middle of the word.
			int length = entry.length();
			System.out.println("length: " + length);
			int mid = length / 2;
			System.out.println("mid: " + mid);
			System.out.println(entry.charAt(mid));

		}

	}
}
