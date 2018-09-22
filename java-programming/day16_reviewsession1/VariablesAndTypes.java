package day16_reviewsession1;

import java.util.Scanner;

public class VariablesAndTypes {
	public static void main(String[] args) {
		//variables -> data container
		/*
		 * Important things about using variables in Java
		 * 	-> type/datatype, name, value
		 * 
		 * Java is a strongly typed language:
		 * 	-> it means before using any variable, we need to declare first
		 * 	When you declare, we need to put type and name:
		 * 	int steps;
		 * int steps;//will not let to declare same variable twice
		 * double steps;//not allowed
		 * Variables names - sometimes can be called as Identifiers 
		 * 
		 * double price;
		 * System.out.println(price); // not initialized compile error
		 * ----------------------------
		 * Initialize - means assigning value for the first time.
		 * 
		 *  double price = 12.40;
		 */
		
		//Variable naming rules:
		
		//1) can be any length - no limit
		String abcqwertyyuiupoisdf234jsdjfsdservvsdfwwwqwernasdkijakr;
		
		//2) Can contain letters, _ , $ , numbers
		int today_is_review1_$session = 1;
		
		//3) Cannot start with numbers. Can contain
		//int 1stDay; will not work
		
		//4) No reserved words , java keywords allowed.
		//Full list : https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
		//int public; double class;
		
		//meaningful names are preferred. and start with lowercase, then next word
		//start with upper case. We call the style camelCase
		
		long worldPopulationCount;
		int Class;//java is case sensitive Class is different from class. 
		int Int=123;
		Scanner scanner = new Scanner(System.in);
		scanner.next();
	}
}
