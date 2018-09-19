package day14_stringmanipulation_cont;

import java.util.Scanner;

public class StatingTheObvious {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your email: ");
		String entry= scan.nextLine(); 
		// donaldtheduck@gmail.com

		// 1 find the location of @ sign
		// 2 find the location of the .
		// substring using those two locations
		
		// it is getting the location of the @ sign and adding one
		// if we don't add 1, it will include @sign in the substring
		int start = entry.indexOf("@")+1;
		
		System.out.println(start);
		System.out.println(entry.substring(start));
		
		int end = entry.indexOf(".");
		
		System.out.println("Oh so you have a "+entry.substring(start, end));
		
	}

}
