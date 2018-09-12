package day10_conditionals4;

import java.util.Scanner;

public class LeapYear {
	/* 2. Leap year(February 29 days):
	if an year is 1) divisible 400 or 
    2) divisible of 4 but NOT divisible of 100 then its a leap year.
	    regular year -> 365
	    leap year -> 366
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter year:");
		
		int year = scan.nextInt();
		
		if( year % 400 == 0) {
			System.out.println("It is a leap year");
		}else if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("It is a leap year");
		}else {
			System.out.println("Not a leap year");
		}
	
//		if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ) {
//			
//		}
		
	}
	
	
}
