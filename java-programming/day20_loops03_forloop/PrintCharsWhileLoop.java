package day20_loops03_forloop;

import java.util.Scanner;

public class PrintCharsWhileLoop {
	public static void main(String[] args) {
		/*
		 * 2. Write a program that accepts a String word
			and using while loop and charAt print each char in separate line.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word");
		String word = input.nextLine();

		int index = 0;
		while(index < word.length()) {
			System.out.println(word.charAt(index));
			index++;
		}
		//TODO : rewrite the code using substring method
		
	}
}
